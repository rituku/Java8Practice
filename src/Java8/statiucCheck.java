package Java8;

public class statiucCheck  {

    static public void test(){
     System.out.println("test 1");
    }
}

class statiucCheck1 extends statiucCheck{
    static public void test(){
        System.out.println("test 2");
    }
}

class test{
    public static void main(String[] args) {
        statiucCheck s = new statiucCheck1();
        
    }
}
