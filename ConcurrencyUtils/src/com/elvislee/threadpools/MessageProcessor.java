package com.elvislee.threadpools;

public class MessageProcessor implements Runnable{
    private int message;

    public MessageProcessor(int message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " [Received] message: " + message);
        respondMessage(message);
        System.out.println(Thread.currentThread().getName() + " (Done) Processing message: " + message);
    }

    private void respondMessage(int message) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Cannot process message: " + message);
        }
    }
}
