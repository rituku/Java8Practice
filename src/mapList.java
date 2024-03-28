import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class mapList {
    public static void main(String[] args) {

        Function<String, String> f = new Function<String, String>() {
            @Override
            public String apply(String s) {
                String st = "";
                for (int i = 0; i < s.length(); i++){
                    if((i % 2) == 0){
                        st = st + s.charAt(i);
                    }
                }
                return st;
            }
        };

        Function<String, String> ft = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return null;
            }
        };

        List<String> ls = Arrays.asList("we", "are", "in", "india");
        ls.stream().map(f).collect(Collectors.toList()).forEach(System.out::println);
    }
}
