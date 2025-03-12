package Java.MultiThreading.MultithreadedSupportedCounter;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
    private AtomicInteger counter = new AtomicInteger();

    public static void main(String[] args) {
        AtomicIntegerDemo atom = new AtomicIntegerDemo();
         System.out.println(atom.counter.get());
         int a = atom.counter.getAndIncrement();
         System.out.println(a);
         System.out.println(a);
         System.out.println(a);
         System.out.println(a);
         System.out.println(a);
        int b = atom.counter.incrementAndGet();
        System.out.println(b);
    }
}
