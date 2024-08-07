package lesson_5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Incubating;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ServiceTest {

    @Mock
    private DataHelper dataHelper = Mockito.mock();

    @InjectMocks
    private Service service;

    @DisplayName("Test of sum")
    @org.junit.jupiter.api.Test
    void sum() {

        int result = service.sum(new Request(1,2));
        assertEquals(3, result);
    }

    @DisplayName("Test of sumException")
    @org.junit.jupiter.api.Test
    void sumException() {

        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> service.sum(new Request(null,2)));
        assertEquals("First is empty", runtimeException.getMessage());
    }

        @org.junit.jupiter.api.Test
    void sumWithDefault() {

        int result = service.sum(new Request(10,null));
        assertEquals(20, result);

    }
    @DisplayName("sumWithDataHelper")
    @org.junit.jupiter.api.Test
    void sumWithDataHelper() {
        when(dataHelper.checkForInteger(anyInt()))
                .thenReturn(100);

        int result = service.sum(new Request(100,10));
        assertEquals(110, result);

    }

    @org.junit.jupiter.api.Test
    void sumWithDataHelperException() {
        when(dataHelper.checkForInteger(anyInt()))
                .thenThrow(RuntimeException.class);

        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> service.sum(new Request(100,10)));
        assertEquals("Error during service running", runtimeException.getMessage());

    }

    @ParameterizedTest
    @MethodSource("fetchData")
    @DisplayName("Parametrizied Tests")
    void parametriziedTests(Request request, int expectedResult) {
        int actualResult = service.sum(request);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> fetchData(){
        return Stream.of(
        Arguments.arguments(new Request(10,10),20),
                Arguments.arguments(new Request(100,200),300),
                Arguments.arguments(new Request(1000,2000),3000)
        );
    }

}