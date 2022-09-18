package multiThreadings;

class myThread1 implements Runnable{
   private int number;

    myThread1(int num){
        this.number = num;
    }

    public void run(){
        String t1 = Thread.currentThread().getName();
        int p = Thread.currentThread().getPriority();
        for(int i = number;i<number+5;i++){
            System.out.println("Thread name: "+t1 + " Priority :" +p+" Value : "+i);
        }
    }

}

public class joinThread {
    public static void main(String[] args) {
        myThread1 m1 = new myThread1(2000);
        Thread t1 = new Thread(m1,"one");
        t1.start();
        try{
            t1.join();
        }catch(InterruptedException e){
            System.out.println("Interption in Thread");
        }
        System.out.println(" T1 End");
        myThread1 m2 = new myThread1(50);
        Thread t2 = new Thread(m2,"Two");
        t2.start();
        System.out.println("End");
    }
}
