package lesson_5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;

class DataHelperTest {

    @ParameterizedTest
    @ValueSource(ints = {4,5,6})
    void checkForInteger(Integer data) {
        DataHelper dataHelper = new DataHelper();
       assertThrows(RuntimeException.class,()-> dataHelper.checkForInteger(data));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void checkForIntegerByString(String value) {
        DataHelper dataHelper = new DataHelper();

        assertEquals(10,dataHelper.checkForIntegerByString(value));
    }
}