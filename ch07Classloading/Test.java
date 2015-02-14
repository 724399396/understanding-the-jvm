package ch07Classloading;

public class Test {
    static {
        i = 0;              // 给变量赋值可以正常通过
        //System.out.println(i); // “非法前向引用" (不可访问)
    }
    static int i = 1;
}
