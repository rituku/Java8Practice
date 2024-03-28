package java2023;

interface ReferInterface{
    void referStatic();
}
interface AddInterface{
    int add(int a, int b);
}

interface MultiplyInterface{
    int mul(int a, int b);
}
public class StaticRefer {
    public static void referStaticMethod(){
        System.out.println("Hello India!!!!");
    }

    public static int addStaticMethod(int a, int b){
        return a + b;
    }

    public int multiplyMethod(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        ReferInterface rf = StaticRefer::referStaticMethod;
        rf.referStatic();

        AddInterface addInterface = StaticRefer::addStaticMethod;
        System.out.println(addInterface.add(2, 4));

        StaticRefer staticRefer = new StaticRefer();
        MultiplyInterface multiplyInterface = staticRefer::multiplyMethod;
        System.out.println(multiplyInterface.mul(3, 4));
    }
}
