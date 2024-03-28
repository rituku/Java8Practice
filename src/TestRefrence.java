import java.sql.Ref;

interface Refrence {
    public void get(String s);
}
public class TestRefrence {
    public static void getInfo(String info){
        System.out.println(info);
    }

    public void testNonStatic(String st){
        System.out.println(st);
    }
    public static void main(String[] args) {
        Refrence r2 = new Refrence() {
            @Override
            public void get(String s) {
                System.out.println(s);
            }
        };
        r2.get("");


        Refrence r = (String s) -> System.out.println(s);
        r.get("ritu rani");

        Refrence r1 = TestRefrence::getInfo;
        r1.get("somit kumar");

        TestRefrence tr = new TestRefrence();
        Refrence rf = tr::testNonStatic;
        rf.get("yyyyyyyyy");
    }
}
