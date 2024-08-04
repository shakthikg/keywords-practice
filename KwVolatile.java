public class KwVolatile {

    private static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread updater = new Thread(() -> {
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            flag = true; 
            System.out.println("Flag updated to true.");
        });

        Thread checker = new Thread(() -> {
            while (!flag) {
                
            }
            System.out.println("Flag is now true.");
        });

        // Start both threads
        updater.start();
        checker.start();

        // Wait for both threads to finish
        try {
            updater.join();
            checker.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
