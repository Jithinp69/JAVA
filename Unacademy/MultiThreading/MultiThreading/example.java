package MultiThreading;

public class example implements Runnable {

    public void run(){
        System.out.println("Running mathod");
    }
    public static void main(String[] args) {

        Runnable r1 = new example();
        Thread t1 = new Thread(r1, "Inside Thread");
        t1.start();
        String str = t1.getName();
        System.out.println(str);
        
    }
}
