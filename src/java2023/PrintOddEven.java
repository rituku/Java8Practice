package java2023;

public class PrintOddEven {
    static int N;
    int counter = 1;
    public void printEven(){
        synchronized (this){
            while (counter < N){
                while ((counter % 2 ) != 0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Even = "+counter);
                counter++;
                notify();
            }
        }
    }

    public void printOdd(){
        synchronized (this){
            while (counter < N){
                while ((counter % 2 ) == 0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Odd = "+counter);
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        N = 10;
        PrintOddEven printOddEven = new PrintOddEven();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printOddEven.printOdd();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printOddEven.printEven();
            }
        });

        thread1.start();
        thread2.start();
    }
}
