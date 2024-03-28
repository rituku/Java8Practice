
class Test1{
    static void testing(){
        System.out.println("test1 ");
    }
}
class Test2 extends Test1{
    static void testing(){
        System.out.println("test2 ");
    }
}
public class staticCheck {
    public static void main(String[] args) {
       // Test2 a = new Test2();
        Test1.testing();
    }
}
