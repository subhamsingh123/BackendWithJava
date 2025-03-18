package Java.MultiThreading;

import java.util.concurrent.locks.*;

public class ReadWriteLockExample {
    private final ReadWriteLock rwLock = new ReentrantReadWriteLock();
    private final Lock readLock = rwLock.readLock();
    private final Lock writeLock = rwLock.writeLock();
    
    public void readData() {
        readLock.lock();
        try {
            System.out.println("Reading data...");
        } finally {
            readLock.unlock();
        }
    }
    
    public void writeData() {
        writeLock.lock();
        try {
            System.out.println("Writing data...");
        } finally {
            writeLock.unlock();
        }
    }
}
