class deadlockExample{
        public static void main(String[] args) {
            String r1 = "Java";
            String r2 = "Hello";

        Thread t1 = new Thread(){
         public void run(){
            System.out.println("Lock has been achieved "+Thread.currentThread().getName());
            synchronized(r1){
                System.out.println("Resource 1 locked");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                   System.out.println(e);
                }

            synchronized(r2){
                System.out.println("Resource 2 locked");
            }
            }
        }
    };

    Thread t2 = new Thread(){
        public void run(){
            synchronized(r2){
                System.out.println("Resource 2 locked");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            synchronized(r1){
                System.out.println("Resource 1 locked");
            }
            }
        }
    };
    t1.start();
    t2.start();

    }
}