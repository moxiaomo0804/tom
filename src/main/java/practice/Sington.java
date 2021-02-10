package practice;

import java.text.SimpleDateFormat;

public class Sington {
    private static volatile Sington instance;
    private static final ThreadLocal<SimpleDateFormat> formatter = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyyMMdd HHmm"));
    private Sington(){};
    public static Sington getInstance() {
        if (instance == null) {
            synchronized (Sington.class) {
                if (instance == null) {
                    instance = new Sington();
                }
            }
        }
        return instance;
    }
}
