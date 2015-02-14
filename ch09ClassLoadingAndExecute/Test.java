package ch09ClassLoadingAndExecute;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by liwei on 15-2-14.
 */
public class Test {
    public static void main(String[] args) throws Throwable {
        InputStream is = new FileInputStream("src/ch09ClassLoadingAndExecute/DynamicProxyTest.class");
        byte[] b = new byte[is.available()];
        is.read(b);
        is.close();

        System.out.println(JavaClassExecuter.execute(b));
    }
}
