package ch07Classloading;

/**
 * Created by liwei on 15-2-13.
 */
public class ParentsDelegationModel {
//    protected synchronized Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        // 首先,检查请求的类是否已经被加载过
//        Class c = findLoadedClass(name);
//        if (c == null) {
//            try {
//                if (parent != null) {
//                    c = parent.loadClass(name, false);
//                } else {
//                    c = findBootstrapClassOrNull(name);
//                }
//            } catch (ClassNotFoundException e) {
//                // 如果父类加载器抛出ClassNotFoundException
//                // 说明父类加载器无法完成加载请求
//            }
//            if (c == null) {
//                //在父类加载器无法加载的时候
//                //再调用本身的findClass方法进行类加载
//                c = findClass(name);
//            }
//        }
//        if (resolve) {
//            resolveClass(c);
//        }
//        return c;
//    }
}
