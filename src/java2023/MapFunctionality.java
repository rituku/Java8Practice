package java2023;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapFunctionality {
    public static void main(String[] args) {
        Function<String, String> f = new Function<String, String>() {
            @Override
            public String apply(String s) {
                String st = "";
                for (int i = 0; i < s.length(); i++){
                    if ((i%2)==0){
                        st = st + s.charAt(i);
                    }
                }
                return st;
            }
        };

        String s = "Hello Universe";
        List<String> ls = Arrays.asList("Hello", "India");
        ls.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

        ls.stream().map(st -> st.charAt(st.length()%2)).collect(Collectors.toList()).forEach(System.out::println);
        ls.stream().map(f).forEach(System.out::println);

        List<Integer> array = Arrays.asList(4, 2, 6, 1, 8);
        array.stream().map(lst -> lst/2).forEach(System.out::print);
        System.out.println();
        array.stream().map(lsm -> lsm/2).filter(lt -> lt > 2).forEach(System.out::print);

    }
}
