package multithreading;

public class MyThread3 extends Thread{

    public void run(){

        /*for (int i = 0; i < 10; i++){
            Thread.yield();
            System.out.println("child thread");
        }*/

        for (int i = 0; i < 5; i++){
            System.out.println("Sita thread");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }
}
