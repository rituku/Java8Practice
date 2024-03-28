import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiStream {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(6, 8, 2, 0);
        List<Integer> l2 = Arrays.asList(3, 5, 8, 1);

        BiFunction<List<Integer>, List<Integer>, List<Integer>> list = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> integers, List<Integer> integers2) {
                return Stream.of(integers, integers2).flatMap(List::stream).distinct().collect(Collectors.toList());
            }
        };

        System.out.println(list.apply(l1, l2));

        BiFunction<String, String, Integer> st = new BiFunction<String, String, Integer>() {
            @Override
            public Integer apply(String s, String s2) {
                return s.length() + s2.length();
            }
        };

        System.out.println(st.apply("test", "test2"));
    }
}
