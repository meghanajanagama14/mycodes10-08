package com.threadutil;

public class PrintNames implements Runnable {
    private String[] names = {"Peter", "Sam", "Edgar", "Mathew", "Simond"};

    public synchronized void printArray() {
        for (String s : names) {
            System.out.println(s);
        }
    }

 
    public void run() {
        printArray();
    }

    public static void main(String[] args) {
        PrintNames printNames = new PrintNames();
        Thread thread1 = new Thread(printNames);
        Thread thread2 = new Thread(printNames);
        thread1.start();
        thread2.start();
    }
}
