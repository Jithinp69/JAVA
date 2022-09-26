class Table {

    public synchronized void createTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class thread1 extends Thread {
    Table t;

    thread1(Table t1) {
        this.t = t1;
    }

    public void run() {
        t.createTable(12);
    }
}

class thread2 extends Thread {
    Table t;

    thread2(Table t2) {
        this.t = t2;
    }

    public void run() {
        t.createTable(250);
    }
}

public class syncExample1 {
    public static void main(String[] args) {
        Table tb = new Table();
        thread1 th1 = new thread1(tb);
        thread2 th2 = new thread2(tb);

        th1.start();
        th2.start();
    }
}
