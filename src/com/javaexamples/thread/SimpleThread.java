package com.javaexamples.thread;

import java.util.Date;
/* Simple example to understand multithreading in java
 * @author Vineetha Indukuri
 */
public class SimpleThread extends Thread {

    public void run() {
    	String threadName = Thread.currentThread().getName();
        System.out.println("Hello from thread " + threadName + " "+  new Date());
        try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Inside thread " + threadName + " after sleep "+ new Date());
    }

    public static void main(String args[]) throws InterruptedException {
    	SimpleThread simpleThread1 = new SimpleThread();
        simpleThread1.start();
        SimpleThread simpleThread2 = new SimpleThread();
        simpleThread2.start();
        System.out.println("Thread " + Thread.currentThread().getName()+ " " + new Date());
        System.out.println("Inside Main " + (new Date()));
        Thread.sleep(10000);
        //main thread waits for the simpleThread1 to finish
        simpleThread1.join();
        System.out.println("In main "+(new Date()));
    }
}