package java2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionClass {
    public static void main(String[] args) {
        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> integers, List<Integer> integers2) {
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i<integers.size();i++){
                    list.add(integers.get(i) + integers2.get(i));
                }
                return list;
            }
        };
        List<Integer> a = Arrays.asList(3, 1, 6, 4, 8);
        List<Integer> a1 = Arrays.asList(1, 4, 2, 6, 0);

        System.out.println(biFunction.apply(a, a1));

        List<Integer> a2 = Arrays.asList(1, 4, 2, 6, 0);
        a2.stream().map(i -> i*2).forEach(System.out::println);
        //a.stream().
    }
}
