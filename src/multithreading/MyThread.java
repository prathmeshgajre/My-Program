package multithreading;

public class MyThread extends Thread{
    /*public void run(){
        for (int i = 0; i <=5; i++){
            System.out.println(Thread.currentThread().getName() + i);
        }
    }*/

    /*private Counter counter;

    public MyThread(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for (int i = 0; i < 1000; i++){
            counter.increment();
        }
    }

    static void main() {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println(counter.getCount());
    }*/

    /*Display d;
    String name;

    MyThread(Display d,String name){
        this.d = d;
        this.name = name;
    }

    public void run(){
        d.wish(name);
    }*/

    Display d;
    String name;

    MyThread(Display d, String name){
        this.d = d;
        this.name = name;
    }

    public void run(){
        d.wish(name);
    }
}
