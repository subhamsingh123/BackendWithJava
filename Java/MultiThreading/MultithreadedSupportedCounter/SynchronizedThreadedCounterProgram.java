package Java.MultiThreading.MultithreadedSupportedCounter;

public class SynchronizedThreadedCounterProgram implements Counter{

    Integer counter  = 0;


    @Override
    public synchronized void increment() {
        counter++;
    }

    @Override
    public synchronized Integer getCounter() {
      return counter;
    }

}
