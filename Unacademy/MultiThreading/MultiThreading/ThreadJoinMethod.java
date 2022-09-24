package MultiThreading;

public class ThreadJoinMethod extends Thread {

    public void run(){
        for(int i=0;i<2;i++){
            try {
                Thread.sleep(2000);
                System.out.println("The current Thread name is "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ThreadJoinMethod TJ1 = new ThreadJoinMethod();
        ThreadJoinMethod TJ2 = new ThreadJoinMethod();
        ThreadJoinMethod TJ3 = new ThreadJoinMethod();

        TJ1.start();

        try {
            System.out.println("The current Thread is "+Thread.currentThread().getName());
            TJ1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        TJ2.start();
        try {
            System.out.println("The current Thread is "+Thread.currentThread().getName());
            TJ1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        TJ3.start();
        try {
            System.out.println("The current Thread is "+Thread.currentThread().getName());
            TJ1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


    