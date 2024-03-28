package java2023;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(4, 6, 3, 8, 6);

        Function<Integer, Integer> fn = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return ((integer / 2) != 0);
            }
        };
        lst.stream().map(fn).filter(predicate).forEach(System.out::println);
    }
}
