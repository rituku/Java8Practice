package practice;

public class PrintEvenOdd {

    static int N;
    int counter = 1;

    public void Even(){
        synchronized (this){
            while (counter < N){
                while ((counter % 2) != 0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Even "+counter);
                counter++;
                notify();
            }
        }
    }
    public void Odd(){
        synchronized (this){
            while (counter < N){
                while ((counter % 2) == 0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Odd "+counter);
                counter++;
                notify();
            }
        }
    }
    public static void main(String[] args) {
        N = 10;
        PrintEvenOdd printEvenOdd = new PrintEvenOdd();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printEvenOdd.Even();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printEvenOdd.Odd();
            }
        });

        thread1.start();
        thread2.start();
    }
}
