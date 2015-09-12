package com.javaexamples.thread;

import java.util.Date;
/* Simple example to understand multithreading in java
 * @author Vineetha Indukuri
 */
public class SimpleThread extends Thread {

    public void run() {
        System.out.println("Hello from thread " + Thread.currentThread().getName());
        try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Inside thread after sleep"+ (new Date()));
    }

    public static void main(String args[]) throws InterruptedException {
    	SimpleThread ht1 = new SimpleThread();
        ht1.start();
        SimpleThread ht2 = new SimpleThread();
        ht2.start();
        System.out.println("Thread " + Thread.currentThread().getName()+ (new Date()));
        System.out.println("Inside Main" + (new Date()));
        Thread.sleep(10000);
        //main thread waits for the ht1 thread
        ht1.join();
        System.out.println("in main "+(new Date()));
    }
}