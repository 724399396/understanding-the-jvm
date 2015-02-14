package ch07Classloading;

public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init!");
    }
}
