package multiThreadings;

// class thread implements Runnable {
//     String msg;

//     thread(String m) {
//         msg = m;
//     }

//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             try {
//                 System.out.println(msg);
//                 Thread.sleep(200);
//             } catch (InterruptedException e) {
//                 System.out.println("Error occured " + e.getMessage());
//             }
//         }
//     }
// }

class myThread extends Thread {
    String message;

    myThread(String m){
        message = m;
        System.out.println("Thread created" + message);
    }

    public void run(){
        System.out.println("Execution started "+message);
        for (int i = 0; i < 5; i++) {
                        try {
                            System.out.println(message);
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            System.out.println("Error occured " + e.getMessage());
                        }
    }

}

public class createThread {
    public static void main(String[] args) {
        // thread t1 = new thread("This is 1st Thread");
        // thread t2 = new thread("This is 2nd Thread");
        // thread t3 = new thread("This is 3rd Thread");

        myThread t1 = new myThread("This is 1st Thread");
        myThread t2 = new myThread("This is 2nd Thread");
        myThread t3 = new myThread("This is 3rd Thread");

        Thread T1 = new Thread(t1);
        Thread T2 = new Thread(t2);
        Thread T3 = new Thread(t3);

        T1.start();
        T2.start();
        T3.start();

    }
}
}
