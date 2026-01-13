package multithreading;

public class ThreadInterruptDemo {
    static void main() {

        MyThreadInterrupt mt = new MyThreadInterrupt();
        mt.start();
        mt.interrupt();
        System.out.println("End of main");
    }
}
