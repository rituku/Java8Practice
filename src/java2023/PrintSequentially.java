package java2023;

public class PrintSequentially {
    public static void main(String[] args) {
        PrintThreadInSequence printThreadInSequence = new PrintThreadInSequence(1);
        PrintThreadInSequence printThreadInSequence1 = new PrintThreadInSequence(2);
        PrintThreadInSequence printThreadInSequence2 = new PrintThreadInSequence(0);

        Thread thread = new Thread(printThreadInSequence,"TH1");
        Thread thread1 = new Thread(printThreadInSequence1,"TH2");
        Thread thread2 = new Thread(printThreadInSequence2,"TH3");

        thread.start();
        thread1.start();
        thread2.start();
    }
}
