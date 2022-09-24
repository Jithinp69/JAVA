package MultiThreading;


// We are just getting value from Thread, Here we are not running Thread.

public class withoutExtendClass {
    public static void main(String[] args) {
// Creating object of Thread class using constructor Thread(String name)         
        Thread t = new Thread("Thread without extending Class");

        // runnable state or active state
        t.start();

        //getting thread name by invoking getName() method
        String str = t.getName();
        System.out.println(str);
    }
}
