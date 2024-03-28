package java2023;

public class PrintSequenceRunnable implements Runnable{

    public int PRINT_UPTO = 10;
    static int number = 1;
    int remainder;
    static Object lock = new Object();
    public PrintSequenceRunnable(int remainder) {
        this.remainder = remainder;
    }

    @Override
    public void run() {
        while(number < PRINT_UPTO-1) {
            synchronized (lock) {
                while(number%3 != remainder) {
                    try {
                        lock.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+ " "+number);
                number++;
                lock.notifyAll();
            }
        }
    }
}
