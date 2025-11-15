package multithreading;

public class ThreadJoinDemo {
    static void main(String[] args) throws InterruptedException{

        MyThread3 t1 = new MyThread3();
        t1.start();
        t1.join(500);
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("Ram thread");
        }
    }
}
