
interface MethTest{
    void meth(String s);
}

interface MethCons {
    MethConst methCons(int a);
}

class MethConst{
     MethConst(int b){
        System.out.println(b);
    }
}

class MethRef {
    public void meth(String s){
        System.out.println(s);
    }
}

public class MethodRefrenceTest {

    public static void main(String[] args) {
       /* MethTest methTest = new MethTest() {
            @Override
            public void meth() {
                System.out.println("testing....");
            }
        };
        methTest.meth();*/

        MethRef methRef = new MethRef();
        MethTest methTest1 = methRef::meth;
        methTest1.meth("test....");

        MethCons methCons = new MethCons() {
            @Override
            public MethConst methCons(int a) {
                System.out.println(a);
                return null;
            }
        };

        methCons.methCons(5);

        MethCons methCons1 = MethConst::new;
        methCons1.methCons(6);

    }
}
