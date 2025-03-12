package Java.MultiThreading.MultithreadedSupportedCounter;
 
import Java.MultiThreading.MultithreadedSupportedCounter.SynchronizedThreadedCounterProgram;;
public class MainClass {

    public static void main(String[] args) {
        SynchronizedThreadedCounterProgram counter = new SynchronizedThreadedCounterProgram();

        // Thread 1: Increments counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Thread 2: Increments counter
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Thread 3: Decrements counter
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                counter.increment();
            }
        });

            t1.start();
            t2.start();
            t3.start();

            try {
                t1.join();
                t3.join();
                t2.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            // t1.join();
      
        System.out.println(counter.getCounter());
    }
    
}
