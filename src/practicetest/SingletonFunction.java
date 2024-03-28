package practicetest;

class SingletonLazy{
    private static SingletonLazy instance = new SingletonLazy();
    private SingletonLazy(){}
    public static SingletonLazy getInstance(){
        if (instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}

class SingletonEgar{
    private static SingletonEgar instance;
    private SingletonEgar(){}

    public static SingletonEgar getInstance(){
        return instance;
    }
}
public class SingletonFunction {
    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        System.out.println(singletonLazy1);
    }
}
