package multithreading;

public class Test1 {
    static void main() throws InterruptedException{

        /*MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();*/

        /*Thread t3 = new Thread(new MyTask());
        Thread t4 = new Thread(new MyTask());
        t4.start();
        t3.start();*/

//        t1.start();
//        t2.start();

        /*MyThread t1 = new MyThread();
        //t1.setPriority(10);
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }*/

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            Thread.sleep(500);



        }
    }
}
