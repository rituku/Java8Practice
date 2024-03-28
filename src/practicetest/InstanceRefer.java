package practicetest;

interface InstanceInterface{
    int add(int a, int b);
}

class InstanceClass{
    public int sum(int a, int b){
        return a + b;
    }
}
public class InstanceRefer {
    public static void main(String[] args) {
        InstanceClass instanceClass  = new InstanceClass();
        InstanceInterface instanceInterface = instanceClass::sum;
        System.out.println(instanceInterface.add(2 , 3));

    }
}
