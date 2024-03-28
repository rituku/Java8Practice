package java2023;

public class PrintThreadSque implements Runnable{
    static Object lock = new Object();
    int reminder;
    static int number = 1;

    public int Print_till = 10;
    public PrintThreadSque(int reminder){
        this.reminder = reminder;
    }

    @Override
    public void run() {
        while (number < Print_till-1){
            synchronized (lock){
                while (number%3 != reminder){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName()+" "+number);
                number++;
                lock.notifyAll();
            }
        }

    }



}
