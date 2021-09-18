package com.elvislee.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    BlockingQueue<Integer> questionQueue;
    int questionNo;

    public Producer(BlockingQueue<Integer> questionQueue) {
        this.questionQueue = questionQueue;
        this.questionNo = 0;
    }
    @Override
    public void run() {
        while(true) {
            try {
                synchronized (this) {
                    int nextQuestion = questionNo++;
                    System.out.println("Go to next question: " + nextQuestion);
                    questionQueue.put(nextQuestion);
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
