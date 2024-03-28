package practicetest;

interface ConstructorInter{
    ConstructorClass adding();
}
class ConstructorClass{
    ConstructorClass(){
        System.out.println("test........");
    }
}
public class ConstructorInterface {
    public static void main(String[] args) {
        ConstructorInter constructorInter = ConstructorClass::new;
        constructorInter.adding();
    }
}
