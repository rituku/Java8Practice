package practicetest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapFunction {

    public static void main(String[] args) {
        Function<String, String> f = new Function<String, String>() {
            @Override
            public String apply(String s) {
                String st = " ";
                char ch[] = s.toCharArray();
                for (int i = 0; i < ch.length; i++){
                    if((i%2)==0){
                        st = st + ch[i];
                    }
                }
                return st;
            }
        };

        List<String> lst = Arrays.asList("we", "are", "family");
        lst.stream().map(f).collect(Collectors.toList()).forEach(System.out::println);

    }
}
