package Java.MultiThreading.MultithreadedSupportedCounter;

import java.util.concurrent.atomic.AtomicInteger;

public class Dead {

    private static final AtomicInteger counter = new AtomicInteger();
    public int num=1;
    public static void main(String[] args) {
        Thread t1= new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet();
            }
        });
    }
}
