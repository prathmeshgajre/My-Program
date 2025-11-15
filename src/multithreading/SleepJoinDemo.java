package multithreading;

public class SleepJoinDemo {
    static void main() {
        Thread download = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Downloading files..");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Download complete.." + e);
                }
            }
        });

        Thread process = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Processing file after download..");
            }
        });

        download.start();
        try {
            download.join();
        }catch (InterruptedException e){

        }
        process.start();
    }

}
