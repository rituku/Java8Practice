package practice;

interface Test{
    Test1 test(String s);
}

class Test1{
    Test1(String s){
        System.out.println(s);
    }
}
public class ConstructorRefernce {
    public static void main(String[] args) {
        Test test = Test1::new;
        test.test("Hello.......");
    }
}
