
interface TestS{
    void test(String st);
}

interface TestS1{
    Testw test(String st);
}

class Testw{
    Testw(String s){
        System.out.println(s);
    }
}
class Testr{
    public static void testd(String s){
        System.out.println(s);
    }

    public void testd1(String s){
        System.out.println(s);
    }

}

public class TestStatic {
    public static void main(String[] args) {
        TestS ts = (String st) -> System.out.println(st);
          ts.test("gggggggggg");

        TestS ts1 = Testr::testd;
        ts1.test("gggrrrrrrrrrrrrgggg");

        Testr trr = new Testr();
        TestS ts2 = trr::testd1;
        ts2.test("gggrrrrqqqqqqqqqqqgg");

        TestS1 tw = Testw::new;
        tw.test("uuuuuuuuu");
    }
}
