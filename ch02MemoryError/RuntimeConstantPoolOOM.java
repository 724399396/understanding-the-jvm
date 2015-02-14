package ch02MemoryError;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 * jdk6抛出异常,jdk7不会
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        //使用List保持着常量池引用，避免Full GC回收常量池行为
        List<String> list = new ArrayList<String>();
        //10M的PermSize在integer范围足够产生OOM了
        int i = 0;
        while(true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
