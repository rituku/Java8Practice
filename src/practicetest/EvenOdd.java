package practicetest;

public class EvenOdd {
    static int N;
    int counter = 1;

    public void printOdd(){
        synchronized (this){
            while (counter < N){
                while (counter % 2 == 0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("odd = "+counter);
                counter++;
                notify();
            }
        }
    }

    public void printEven(){
        synchronized (this){
            while (counter < N){
                while (counter % 2 != 0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("even = "+counter);
                counter++;
                notify();
            }
        }
    }


    public static void main(String[] args) {
        N = 10;
        EvenOdd evenOdd = new EvenOdd();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                evenOdd.printOdd();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                evenOdd.printEven();
            }
        });
        thread.start();
        thread1.start();
    }
}
