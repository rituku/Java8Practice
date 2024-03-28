package java2023;

class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

   private SingletonEager(){}
    public static SingletonEager getInstance(){
       return instance;
    }
}
class SingletonLazy{
    private static SingletonLazy instance;
    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
class SingletonThreadSafeOnMethod{
    private static SingletonThreadSafeOnMethod  instance;
    private SingletonThreadSafeOnMethod(){}
    public static synchronized SingletonThreadSafeOnMethod getInstance(){
        if (instance == null){
            instance = new SingletonThreadSafeOnMethod();
        }
        return instance;
    }
}

class SingletonThreadSafeOnBlock{
    private static SingletonThreadSafeOnBlock  instance;
    private SingletonThreadSafeOnBlock(){}
    public static synchronized SingletonThreadSafeOnBlock getInstance(){
        if (instance == null){
            synchronized (SingletonThreadSafeOnBlock.class){
                if (instance == null){
                    instance = new SingletonThreadSafeOnBlock();
                }
            }
        }
        return instance;
    }
}
public class SingletonEgar {
    public static void main(String[] args) {
        /*SingletonEager singletonEager = SingletonEager.getInstance();
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        System.out.println(singletonEager);
        System.out.println(singletonEager1);*/

        /*SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        System.out.println(singletonLazy1);*/

        SingletonThreadSafeOnMethod singletonThreadSafeOnMethod = SingletonThreadSafeOnMethod.getInstance();
        SingletonThreadSafeOnMethod singletonThreadSafeOnMethod1 = SingletonThreadSafeOnMethod.getInstance();

        System.out.println(singletonThreadSafeOnMethod);
        System.out.println(singletonThreadSafeOnMethod1);

        SingletonThreadSafeOnBlock singletonThreadSafeOnBlock = SingletonThreadSafeOnBlock.getInstance();
        SingletonThreadSafeOnBlock singletonThreadSafeOnBlock1 = SingletonThreadSafeOnBlock.getInstance();

        System.out.println(singletonThreadSafeOnBlock);
        System.out.println(singletonThreadSafeOnBlock1);

    }
}
