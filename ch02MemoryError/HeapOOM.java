package ch02MemoryError;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author liwei
 */
public class HeapOOM {
    static class OOMObject {
    }

    public static void main(String[] argrs) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while(true) {
            list.add(new OOMObject());
        }
    }
}
