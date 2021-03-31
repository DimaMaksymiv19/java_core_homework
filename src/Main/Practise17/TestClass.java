package Main.Practise17;

import java.util.Objects;

public class TestClass {
    @UselessAnotation("something")
    private String something;
    @UselessAnotation("something")
    private int number;

    public TestClass(String something, int number) {
        this.something = something;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass testClass = (TestClass) o;
        return number == testClass.number && Objects.equals(something, testClass.something);
    }

    @Override
    public int hashCode() {
        return Objects.hash(something, number);
    }
    @UselessAnotation("something")
    public String getSomething() {
        return something;
    }
    @UselessAnotation("something")
    public void setSomething(String something) {
        this.something = something;
    }
    @UselessAnotation("something")
    public int getNumber() {
        return number;
    }
    @UselessAnotation("something")
    public void setNumber(int number) {
        this.number = number;
    }
}
