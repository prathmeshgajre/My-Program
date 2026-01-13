package multithreading;

public class SynchronizedDemo {
    static void main() {

        /*Display d = new Display();
        Display d1 = new Display();

        MyThread t1 = new MyThread(d,"Dhoni");
        MyThread t2 = new MyThread(d1,"Yuvraj");

        t1.start();
        t2.start();*/

        /*Display d = new Display();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);

        t1.start();
        t2.start();*/

        Display d1 = new Display();
        Display d2 = new Display();
        MyThread t1 = new MyThread(d1,"Dhoni");
        MyThread t2 = new MyThread(d2,"Yuvraj");

        t1.start();
        t2.start();
    }
}
