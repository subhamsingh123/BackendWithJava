public class BasicMultiThreading {
    public static void main(String[] args) {
        System.out.println("Main Thread Running");
        System.out.println(Thread.currentThread().getName());
        //Implementing Multithreading using Threads class
        World t1 = new World();
        t1.start();
        //Implementing Multithreading using Runnable Interface
        Hello h1 = new Hello();
        Thread t2 = new Thread(h1);
        t2.start();
    }
    
}
