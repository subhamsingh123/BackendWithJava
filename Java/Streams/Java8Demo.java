package Java.Streams;

class Task implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<100;i++)
        System.out.println("hello");
    }

}
public class Java8Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task());
        t1.start();
        Thread t2 = new Thread(() ->{
            for(int i=0;i<100;i++)
            System.out.println("hello from 2nd Thread");
        });
        t2.start();

    }
    
}
