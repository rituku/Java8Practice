public class PrintAlternate {
    static int N;
    int counter = 1;
    public void printthread1(){
        synchronized (this){
            while (counter < N){
                while (counter % 2 == 0){
                    try {
                       wait();
                    }catch (Exception e){
                       e.printStackTrace();
                    }
                }
                System.out.println("thread 1 "+counter);
                counter++;
                notify();;
            }
        }
    }

    public void printthread2(){
        synchronized (this){
            while (counter < N){
                while (counter % 2 != 0){
                    try {
                        wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                System.out.println("thread 2 "+counter);
                counter++;
                notify();;
            }
        }
    }

    public static void main(String[] args) {
        N = 10;
        PrintAlternate pt = new PrintAlternate();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                pt.printthread1();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                pt.printthread2();
            }
        });

        t1.start();
        t2.start();
    }
}
