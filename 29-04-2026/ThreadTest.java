import java.lang.*;

class MyThreadTest extends Thread {
    public MyThreadTest(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY); // Set default priority
    }

    @Override
    public void run() {
        int i = 0;
        while(i < 5) {
            System.out.println(getName() + " is running: " + i);
            i++;
            try {
                Thread.sleep(1000); // Sleep for 1 second to simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " has finished running.");
    }
}

class ThreadTest {
    public static void main(String[] args) {
        MyThreadTest thread1 = new MyThreadTest("Thread-1");
        MyThreadTest thread2 = new MyThreadTest("Thread-2");

        // Start the threads
        thread1.start();
        System.out.println("Thread1 state: " + thread1.getState());
        System.out.println("Thread1 Name: " + thread1.getName());
        System.out.println("Thread1 ID: " + thread1.getId());
        System.out.println("Thread1 Priority: " + thread1.getPriority());
        thread2.start();
        System.out.println("Thread2 state: " + thread2.getState());
        System.out.println("Thread2 Name: " + thread2.getName());
        System.out.println("Thread2 ID: " + thread2.getId());
        System.out.println("Thread2 Priority: " + thread2.getPriority());
        thread1.interrupt(); // Interrupt thread1 to demonstrate interruption
        thread2.interrupt(); // Interrupt thread2 to demonstrate interruption
    }
}