package com.elvislee.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        // Specify the number of threads, recycle them
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable process1 = new MessageProcessor(1);
        executor.execute(process1);

        Runnable process2 = new MessageProcessor(2);
        executor.execute(process2);

        Runnable process3 = new MessageProcessor(3);
        executor.execute(process3);

        // Rejects any new tasks from being submitted. Gracefully shuts down the service
        executor.shutdown();

        try {
            // Block the code here to wait the timeout or executor shutdown, whichever is earlier
            // An alternative for the below while loop
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Prevent the last line from being printed
//        while(!executor.isTerminated()) {
//
//        }

        System.out.println("All tasks submitted!");
    }
}
