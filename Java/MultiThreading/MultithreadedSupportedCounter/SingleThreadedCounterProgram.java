package Java.MultiThreading.MultithreadedSupportedCounter;

public class SingleThreadedCounterProgram implements Counter{

    Integer counter  = 0;


    @Override
    public void increment() {
        counter++;
    }

    @Override
    public Integer getCounter() {
      return counter;
    }
    
    public static void main(String[] args) {
        SingleThreadedCounterProgram singleThreadedCounterProgram= new SingleThreadedCounterProgram();
        
        for(int i =0; i<100; i++){
        System.out.println(singleThreadedCounterProgram.getCounter());
        singleThreadedCounterProgram.increment();
        }
        
    }
}
