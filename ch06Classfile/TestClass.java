package ch06Classfile;

public class TestClass {
    private int m;

    public int inc() {
        return m + 1;
    }

    public int int2() {
        int x;
        try {
            x = 1;
            return x;
        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
        }
    }
}
