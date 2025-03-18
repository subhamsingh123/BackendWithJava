package Java.MultiThreading.MultithreadedSupportedCounter;

public class Dead {

    public syncronized int num(){
        
    }
    public static void main(String[] args) {
        Thread t1= new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
    }
}
