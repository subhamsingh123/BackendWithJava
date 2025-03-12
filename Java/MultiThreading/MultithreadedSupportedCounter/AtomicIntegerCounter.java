package Java.MultiThreading.MultithreadedSupportedCounter;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerCounter {
    
    private AtomicInteger count = new AtomicInteger(0);



    @Override
    public synchronized void increment() {
        count.incrementAndGet();
        count.getAndIncrement();
    }

    @Override
    public synchronized Integer getCounter() {
      return counter;
    }

}
