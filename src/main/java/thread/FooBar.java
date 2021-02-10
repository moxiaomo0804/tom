package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class FooBar {
    private int n;
    private Lock lock;
    private volatile int state;
    private Condition c1;
    private Condition c2;

    public FooBar(int n) {
        this.n = n;
        this.lock = new ReentrantLock();
        this.state = 1;
        c1 = lock.newCondition();
        c2 = lock.newCondition();
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            lock.lock();
            while(state != 1) {
                c1.await();
            }
            
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            state = 2;
            c2.signal();
            lock.unlock();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            lock.lock();
            while(state != 2) {
                c2.await();
            }
            
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            state = 1;
            c1.signal();
            lock.unlock();
        }
    }
}