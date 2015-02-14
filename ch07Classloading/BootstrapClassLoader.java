package ch07Classloading;

import sun.security.util.SecurityConstants;

/**
 * Created by liwei on 15-2-13.
 */
public class BootstrapClassLoader {
    /**
     * Returns the class loader for the class. Some implementations may use null
     * to represent the bootstrap class loader. This method will return null in such
     * implementations if this class was loaded by the bootstrap class loader.
     */
    public ClassLoader getClassLoader() {
        ClassLoader cl = getClassLoader();
        if (cl == null)
            return null;
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
//            ClassLoader ccl = ClassLoader.getCallerClassLoader();
//            if (ccl != null && ccl != cl && cl.isAncesstor(ccl)) {
//                sm.checkPermission(SecurityConstants.GET_CLASSLOADER_PERMISSION);
//            }
        }
        return cl;
    }
}
