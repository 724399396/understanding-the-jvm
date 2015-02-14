package ch03GC;

public class MinorGC {
    private static final int _1MB = 1024 * 1024;

    /**
     * 查看GC的情况,Eden,Survivor,Old等
     * VM Args: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    @SuppressWarnings("unused")
    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
    }

    /**
     * VM Args: -verbose:gc -Xms20M -Xmx:20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1
     */
    @SuppressWarnings("unused")
    public static void testTenuringThresholds() {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];
        // 什么时候进入老年代取决于 XX:MaxTenuringThreshold
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[6 * _1MB];
        allocation3 = null;
        allocation3 = new byte[6   * _1MB];
    }

    /**
     * VM Args: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThresholds=15
     *          -XX:+PrintTenuringDistribution
     */
    @SuppressWarnings("unused")
    public static void testTenuringThresholds2() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1MB / 4];
        // allocation1 + allocation2 大于survivor空间一半。且年龄相等
        allocation2 = new byte[_1MB / 4];
        allocation3 = new byte[4 * _1MB];
        allocation4 = new byte[4 * _1MB];
        allocation4 = null;
        allocation4 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        //testAllocation();
        //testTenuringThresholds();
        testTenuringThresholds2();
    }
}
