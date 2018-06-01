/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MylinkedList;

/**
 *
 * @author Admin
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class E30_4 {
    static int maxThreads = 1000;
    static int delay = 10;

    public static void main(String[] args) {
        System.out.print("asynchronous sums:");
        for (int i = 0; i < 10; i++)
            System.out.printf(" %4d", async());
        System.out.print("\n synchronous sums:");
        for (int i = 0; i < 10; i++)
            System.out.printf(" %4d", sync());
    }

    static int async() {
        final Integer sum = new Integer();
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < maxThreads; i++)
            executor.execute(new IncrementTask(sum, delay));
        executor.shutdown();
        try {
            executor.awaitTermination(2*delay, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sum.getValue();
    }

    static int sync() {
        final Integer sum = new Integer();
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < maxThreads; i++)
            synchronized (sum) {
                executor.execute(new IncrementTask(sum, delay));
            }
        executor.shutdown();
        try {
            executor.awaitTermination(2*delay, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sum.getValue();
    }

}

class Integer {
    private int value;

    Integer() {
        this.reset();
    }

    int getValue() {
        return value;
    }

    void reset() {
        this.value = 0;
    }

    void increment(int amt) {
        this.value += amt;
    }
}


class IncrementTask implements Runnable {
    Integer sum;
    int delay;

    public IncrementTask(Integer sum, int delay) {
        this.sum = sum;
        this.delay = delay;
    }

    @Override
    public void run() {
        sum.increment(1);
        try {
            Thread.sleep(delay); // introduce delay to reveal errors
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}