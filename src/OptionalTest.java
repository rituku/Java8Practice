import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) throws Exception {
        List<String> ls = Arrays.asList("test", "test1" , "test2");
        Optional<String> op = Optional.empty();
        System.out.println(op.isPresent());

        Optional<String> opt = Optional.ofNullable(null);
       // System.out.println(opt.orElseGet(() -> "Tests"));
        System.out.println(opt.orElseThrow(() -> new Exception("ggggg")));


    }
}
