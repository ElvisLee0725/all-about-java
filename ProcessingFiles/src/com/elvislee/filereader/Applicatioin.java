package com.elvislee.filereader;

import java.io.*;

public class Applicatioin {
    public static void main(String[] args) {
        File file = new File("textFile.txt");
        // BufferReader is syncronous in nature. During multithreading environment, BufferReader should be used.

        // Define those FileReader and BufferReader in try(), so we don't need to close them in finally block
        // This is Java 7 feature. Anything is auto closeable can be defined in try()
        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            String line = bufferedReader.readLine();
            while(line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be found");
        } catch (IOException e) {
            System.out.println("Problem reading file: " + file.getName());
        }
    }
}
