package com.elvislee.threading;

public class Sequence {
    private int value = 0;

    public int getNext() {
        // Whatever in the synchronized block, it won't yield to other thread until its fully executed!
        synchronized (this) {
            value++;
            return value;
        }
    }

    // Or just add synchronized to the method
    public synchronized int getNext2() {
        value++;
        return value;
    }
}
