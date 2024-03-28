package practicetest;

interface StaticInterface{
    int sum(int a, int b);
}
class StaticReferance{
    public static int add(int a, int c){
        return a+c;
    }
}
public class StaticRefer {
    public static void main(String[] args) {
        StaticInterface staticInterface = StaticReferance::add;
        System.out.println(staticInterface.sum(6, 3));
    }
}
