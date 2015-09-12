import java.util.Date;

public class HelloThread extends Thread {

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
    	HelloThread ht1 = new HelloThread();
        ht1.start();
        HelloThread ht2 = new HelloThread();
        ht2.start();
        System.out.println("Thread " + Thread.currentThread().getName()+ (new Date()));
        System.out.println("Inside Main" + (new Date()));
        Thread.sleep(10000);
        ht1.join();
        System.out.println("in main "+(new Date()));
    }
}