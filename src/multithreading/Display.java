package multithreading;

public class Display {
    /*public static synchronized void wish(String name){
        for(int i = 0; i < 5; i++){
            System.out.print("Good morning ");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
            }
            System.out.println(name);
        }
    }*/

    /*public synchronized void displayn(){
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }

    public synchronized void displayc() {
        for (int i = 65; i <= 75; i++) {
            System.out.print((char) i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }*/

    public void wish(String name){
        ;;;;;;;;;;; //1 lakh lines of code
        synchronized (Display.class) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Good morning..");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(name);
                }
            }
        }

    }
}
