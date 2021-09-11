package com.elvislee.filereader;

class MyClass implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Closing MyClass");
    }
}
public class Application2 {
    public static void main(String[] args) {
        try(MyClass obj = new MyClass();) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
