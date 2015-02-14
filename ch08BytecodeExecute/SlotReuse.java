package ch08BytecodeExecute;

/**
 * Created by liwei on 15-2-13.
 */
public class SlotReuse {
    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        //int a = 0;
        System.gc();
    }
}
