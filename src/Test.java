interface A {
    public void getName(String name);
}
public class Test {
    public static void getInfo(String info) {
        System.out.println(info);
    }

    public static void main(String[] args) {
        A a = (String s) -> System.out.println(s); //providing implementation of getName(String name) using Lambda Expression
        a.getName("SAM is executing");

        A a1 = Test::getInfo; // refering to pre-existing getInfo(String info) of class Test as arguments are same as getName(String name)
        a1.getName("getInfo() of Test class is executing");
    }
}
