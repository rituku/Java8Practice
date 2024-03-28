package java2023;

interface LambdaI{
    int sum(int a, int b);
}
public class LambdaSum {
    public static void main(String[] args) {
        LambdaI l = (a,b) -> a+b;
        System.out.println(l.sum(7, 1));
    }
}
