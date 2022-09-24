package MultiThreading;

// import java.lang.Thread;

public class SleepMethodinMain {
    public static void main(String[] args) {

        try {
            for(int i=1;i<5;i++){
                Thread.sleep(1000);
                System.out.print(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
    }
}
