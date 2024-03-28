
interface SampleRef{
    SampleR get(String s);
}

class SampleR{
    SampleR(String s){
        System.out.println(s);
    }

    public void get1(String st){
        System.out.println(st);
    }
}
public class SampleTest {
    public static void main(String[] args) {
        SampleRef s = SampleR::new;
        s.get("tttttt");
    }
}
