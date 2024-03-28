package java2023;

interface LambdaInterface{
    void print();
}

/*class ImplementationClass implements LambdaInterface{

    @Override
    public void print() {
        System.out.println("Hello");
    }
}*/
public class Lambda {
    public static void main(String[] args) {
        /*LambdaInterface lambdaInterface = new ImplementationClass();
        lambdaInterface.print();*/

        LambdaInterface l = new LambdaInterface() {
            @Override
            public void print() {
                System.out.println("India");
            }
        };
        l.print();

        LambdaInterface LI = () -> System.out.println("Welcome");
        LI.print();

    }

}
