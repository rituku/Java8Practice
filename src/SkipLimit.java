import java.util.Arrays;
import java.util.List;

public class SkipLimit {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3, 4, 1, 7, 8);
        ls.stream().skip(1).limit(2).forEach(System.out::println);
    }
}
