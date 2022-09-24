package MultiThreading;

public class MultiThreadingDemo extends Thread{
    
    public void run(){
        try {
            System.out.println("Thread "+Thread.currentThread().getId()+ " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }

    public static void main(String[] args) {
        int n = 8; //number of threads
        for(int i=0;i<n;i++){
            MultiThreadingDemo object = new MultiThreadingDemo();
            object.start();
        }
    }
}
