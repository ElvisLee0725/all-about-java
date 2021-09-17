package com.elvislee.threading;

public class Application {
    public static void main(String[] args) {
        Task thread1 = new Task();
        thread1.start();

        Task thread2 = new Task();
        thread2.start();

        System.out.println("Hello world");
    }
}

class Task extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Number: " + i);
        }
    }
}
