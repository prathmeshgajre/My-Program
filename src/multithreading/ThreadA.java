package multithreading;

public class ThreadA {
    static void main() throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();

        synchronized (b){
            System.out.println("main thread trying to call wait() method");
            b.wait();
            System.out.println("main thread got notification");
            System.out.println(b.total);
        }
    }
}
