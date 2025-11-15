package multithreading;

public class MyThreadInterrupt extends Thread {

    public void run(){

        /*try {
            for (int i = 0; i < 5; i++){
                System.out.println("child thread");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }*/

        for (int i = 0; i <= 10000; i++){
            System.out.println("Lazy Thread - " + i);
        }
        System.out.println("I want to sleep");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("I got interrupted");
        }
    }
}
