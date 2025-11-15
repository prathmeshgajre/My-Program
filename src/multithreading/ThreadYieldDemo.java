package multithreading;

public class ThreadYieldDemo {
    static void main() {

        MyThread3 t1 = new MyThread3();
        t1.start();
        //t1.setPriority(9);
        //Thread.currentThread().setPriority(10);
        //System.out.println(Thread.currentThread().getPriority());
        //System.out.println(t1.getPriority());
        for (int i = 0; i < 10; i++){
            System.out.println("main thread");
        }
    }
}
