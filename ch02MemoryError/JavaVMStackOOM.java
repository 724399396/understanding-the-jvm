package ch02MemoryError;

/**
 * VM Args: -Xss2M(这时可以设置大一点，尽快产生溢出)
 */
public class JavaVMStackOOM {
    private void dontStop() {
        while(true) {
        }
    }

    public void stackLeakByThread() {
        while(true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
