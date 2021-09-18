package com.elvislee.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {
    public static void main(String[] args) {
        BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<Integer>(5);
        Thread thread1 = new Thread(new Producer(questionQueue));
        Thread thread2 = new Thread(new Consumer(questionQueue));

        thread1.start();
        thread2.start();
    }
}
