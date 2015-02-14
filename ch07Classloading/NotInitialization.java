package ch07Classloading;


public class NotInitialization {
    public static void main(String[] args) {
        /**
         * 被动使用类字段演示一:
         * 通过子类引用父类的静态字段,不会导致子类初始化
         */
        //System.out.println(SubClass.value);
        /**
         * 被动使用类字段演示二:
         * 通过数组定义引用类，不会触发此类的初始化
         */
        SuperClass[] sca = new SuperClass[10];
        /**
         * 非主动使用类字段演示
         */
        System.out.println(ConstClass.HELLOWORLD);
    }
}
