import classes.Watch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread watchThread = new Thread(new Watch(), "Watch Thread");

        watchThread.start();
        
        watchThread.join(1200);

    }
}

