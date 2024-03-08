package allprg;
class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            // Sleep for 500 milliseconds
            Thread.sleep(500);
            System.out.println(threadName + " is running.");
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable("Thread 1");
        MyRunnable myRunnable2 = new MyRunnable("Thread 2");

        // Create threads using the Runnable instances
        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);

        // Start each thread
        thread1.start();
        thread2.start();
    }
}

