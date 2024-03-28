package java2023;

public class PrintThreadInSequence implements Runnable{
    static Object lock = new Object();
    public int Print_till = 10;
    static int number = 1;
    int reminder;

    public PrintThreadInSequence(int reminder){
        this.reminder = reminder;
    }
    @Override
    public void run(){
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
