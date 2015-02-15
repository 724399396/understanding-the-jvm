package ch11RuntimeOptimizations;

/**
 * Created by liwei on 15-2-15.
 */
public class Inline {
    static class B {
        int value;
        final int get() {
            return value;
        }
    }

    int y,z,sum;
    B b = new B();

    public void foo() {
        y = b.get();
        z = b.get();
        sum = y + z;
    }
}
