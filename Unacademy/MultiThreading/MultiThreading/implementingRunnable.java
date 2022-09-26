package MultiThreading;


public class implementingRunnable implements Runnable {
    public void run(){
        System.out.println("Thread running in Runnable Interface");
    }

    public static void main(String[] args) {
        implementingRunnable ir1 = new implementingRunnable();    // object
        Thread t1 = new Thread(ir1);  
        t1.start(); 
    }
}
