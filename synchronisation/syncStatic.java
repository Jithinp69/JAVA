class Tables {
    synchronized static void createTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    synchronized void createTable2(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class thread3 extends Thread {
    public void run() {
        Tables.createTable(12);
    }
}

class thread4 extends Thread {
    public void run() {
        Tables.createTable(250);
    }
}

public class syncStatic {
    public static void main(String[] args) {

        thread3 th3 = new thread3();
        thread4 th4 = new thread4();

        th3.start();
        th4.start();
    }
}
