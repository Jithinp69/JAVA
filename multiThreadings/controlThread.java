package multiThreadings;

class myThreads implements Runnable{

    public void run(){
        String t1 = Thread.currentThread().getName();
        int p = Thread.currentThread().getPriority();
        System.out.println("Thread name: "+t1 + " Priority :" +p);
    }

}
public class controlThread {
    public static void main(String[] args){
        myThreads m1 = new myThreads();
        myThreads m2 = new myThreads();
        myThreads m3 = new myThreads();

        Thread t1 = new Thread(m1,"one");
        Thread t2 = new Thread(m2,"Two");
        Thread t3 = new Thread(m3,"Three");


        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
