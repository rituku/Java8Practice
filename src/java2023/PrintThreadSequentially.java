package java2023;

public class PrintThreadSequentially {

    public static void main(String[] args) {
        PrintSequenceRunnable seq1 = new PrintSequenceRunnable(1);
        PrintSequenceRunnable seq2 = new PrintSequenceRunnable(2);
        PrintSequenceRunnable seq3 = new PrintSequenceRunnable(0);

        Thread t1 = new Thread(seq1,"t1");
        Thread t2 = new Thread(seq2, "t2");
        Thread t3 = new Thread(seq3, "t3");

        t1.start();
        t2.start();
        t3.start();
    }
}
