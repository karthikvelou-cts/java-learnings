import java.lang.*;
import java.util.*;

class ThreadOthersTest extends Thread {
    public void run() {
        int i = 0;
        while(true)
        {
            System.out.println("Thread is running: " + i);
            i++;
        }
    }

    public static void main(String[] args) {
        ThreadOthersTest thread = new ThreadOthersTest();
        thread.start();
        int i = 0;
        while(true)
        {
                System.out.println("Main thread is running..." + i);
                i++;
                Thread.yield(); // Yielding to allow other threads to execute
        }
    }

}