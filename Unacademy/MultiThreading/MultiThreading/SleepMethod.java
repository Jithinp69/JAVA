package MultiThreading;

public class SleepMethod extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        SleepMethod s1 =new SleepMethod();
        SleepMethod s2 = new SleepMethod();
        SleepMethod s3 = new SleepMethod();

        s1.start();
        try {
            s1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        s2.start();
        s3.start();
    }
}
