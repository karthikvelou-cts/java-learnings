import java.lang.*;
import java.util.*;


class MyThread extends Thread {
    public void run() {
        int i = 0;
        while(true)
        {
            System.out.println("Thread is running: " + i);
            i++;
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        int i = 0;
        while(true)
        {
                System.out.println("Main thread is running..." + i);
                i++;
        }
    }
}