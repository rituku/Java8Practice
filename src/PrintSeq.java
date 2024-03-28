public class PrintSeq {
    public static void main(String[] args) {
        Printsequence ps = new Printsequence(1);
        Printsequence ps1 = new Printsequence(2);
        Printsequence ps2 = new Printsequence(0);
        /*Thread t1 = new Thread(ps);
        Thread t2 = new Thread(ps1);
        Thread t3 = new Thread(ps2);*/
        Thread t1=new Thread(ps,"T1");
        Thread t2=new Thread(ps1,"T2");
        Thread t3=new Thread(ps2,"T3");
        t1.start();
        t2.start();
        t3.start();
    }

}
