package qunar.tc.qmq.utils;

public class ThreadLocalUtils {


    private static ThreadLocal<Long> local = new ThreadLocal<Long>();

    public static Long getCurrentMills() {
        return local.get();
    }

    public static void setCurrentMills(Long mills) {
        local.set(mills);
    }


    public static void remove() {
        local.remove();
    }
}
