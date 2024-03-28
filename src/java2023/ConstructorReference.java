package java2023;

interface ConsRefer{
    void add(int a, int b);
}
class ConstRefer{
     ConstRefer(int a, int b){
         System.out.println(a+b);
    }
}
public class ConstructorReference {
    public static void main(String[] args) {
ConsRefer consRefer =  ConstRefer::new;
consRefer.add(7, 1);
    }
}
