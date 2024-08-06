package lesson_3.oop;

public class GoodClass {

    private String name;
    private int age;
    private boolean isTrue;

    // alt + insert
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 10 || age > 70){
            throw new RuntimeException("Некорректное значение");
        }
        this.age = age;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }
}
