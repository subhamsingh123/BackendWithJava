package Java.MultiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class DeadlockDemo {
    
    public final java.util.concurrent.locks.Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        DeadlockDemo d = new DeadlockDemo();
        d.outerMethod();

    }

    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("Inner Method");

        }
        finally{
        lock.unlock();
        }
    }

    public void outerMethod(){
        lock.lock();
try {
    System.out.println("Outer Method");
    innerMethod();
} finally {
    lock.unlock();
}
        
    }
    
}
