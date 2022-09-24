package MultiThreading;

public class ExtendingThread extends Thread {
    
    public void run(){  // Running State
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ExtendingThread t1 = new ExtendingThread();  // object of class Main, as we extending to Thread it will become Thread.
        t1.start();   // Runnable state.
    }
} 
