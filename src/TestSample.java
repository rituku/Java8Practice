
interface InterfaceSample{
    public Sample get();
}

class Sample{
    Sample(){
        System.out.println("In sample ");
    }
}
public class TestSample {
    public static void main(String[] args) {
        InterfaceSample iterSamp = Sample::new;
        iterSamp.get();

    }
}
