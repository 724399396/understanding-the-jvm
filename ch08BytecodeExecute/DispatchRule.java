package ch08BytecodeExecute;
import static java.lang.invoke.MethodHandles.lookup;

import java.lang.invoke.MethodType;

public class DispatchRule {
    class GrandFather {
        void thinking() {
            System.out.println("i am grandfather");
        }
    }

    class Father extends GrandFather {
        void thinking() {
            System.out.println("i am father");
        }
    }

    class Son extends Father {
        void thinking() {
            // 请读者在这里填入适当的代码(不能修改其他代码)
            // 实现调用祖父类的thinking方法
            MethodType mt = MethodType.methodType(void.class);
            try {
                lookup().findVirtual(GrandFather.class, "thinking", mt).bindTo(new GrandFather()).invokeExact();
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DispatchRule dr = new DispatchRule();
        dr.new Son().thinking();
    }
}
