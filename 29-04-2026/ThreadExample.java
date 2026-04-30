import java.lang.*;
import java.util.*;

class Test extends Thread {
    public void run() {
        int i = 0;
        while(i<100)
        {
            System.out.println("Thread is running: " + i);
            i++;
        }
    }
}

class ThreadExample {

    public static void main(String[] args) {
        Test thread = new Test();
        thread.start();
        int i = 0;
        while(i<100)
        {
                System.out.println("Main thread is running..." + i);
                i++;
        }
    }
}