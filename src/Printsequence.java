public class Printsequence implements Runnable{

   public int PRINT_NUMBER = 10;
    static int number = 1;

    int rem;
    static Object lock = new Object();
    public Printsequence(int rem){
        this.rem = rem;
    }

    @Override
    public void run() {

        while (number < PRINT_NUMBER -1){
            synchronized (lock){
                while (number % 3 != rem){
                    try {
                        lock.wait();
                    }catch (Exception e){
e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }

    }
}
