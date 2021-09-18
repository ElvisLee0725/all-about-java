package com.elvislee.threading;

public class Application {
    public static void main(String[] args) {

        // Create a thread, method 1 class implements Runnable:
        System.out.println("Start thread 1: ");
        Thread t1 = new Thread(new Task("Thread-a"));
        t1.start();

        // Create a thread, method 2 use Runnable:
        System.out.println("Start thread 2: ");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
               // Thread.currentThread().setName(this.name);

                for(int i = 0; i < 100; i++) {
                    System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t2.start();
    }
}

class Task implements Runnable {
    String name;

    public Task(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        Thread.currentThread().setName(this.name);

        for(int i = 0; i < 100; i++) {
            System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//class Task extends Thread {
//    String name;
//
//    public Task(String name) {
//        this.name = name;
//    }
//    @Override
//    public void run() {
//        Thread.currentThread().setName(this.name);
//
//        for(int i = 0; i < 100; i++) {
//            System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
