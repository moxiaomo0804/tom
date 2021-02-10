package leetcode;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LinkedBlockingQueue<E> {
    private final int capacity;
    private Lock lock = new ReentrantLock();
    private Condition unfull = lock.newCondition();
    private Condition unEmpty = lock.newCondition();
    private  int count;
    private LinkedList<E> queue;

    public LinkedBlockingQueue() throws InterruptedException {
        this(Integer.MAX_VALUE);
    }

    public LinkedBlockingQueue(int capacity) {
        this.capacity = capacity;
        queue = new LinkedList<>();
    }
    public void put(E e) throws InterruptedException {
        lock.lock();
        try {
            while (count == capacity) {
                unfull.await();
            }
            queue.add(e);
            count++;
            unfull.signal();
        } finally {
            lock.unlock();
        }
    }

    public E take() throws InterruptedException {
        lock.lock();
        try {
            while (count == capacity) {
                unEmpty.await();
            }
            E e = queue.pop();
            count--;
            unEmpty.signal();
            return e;
        } finally {
            lock.unlock();
        }
    }
}
