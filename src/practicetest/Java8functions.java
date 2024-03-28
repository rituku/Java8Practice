package practicetest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Java8functions {
    public static void main(String[] args) {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return (integer % 2) ==0;
            }
        };
        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer *3;
            }
        };
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        List<Integer> lst = Arrays.asList(4, 2, 8, 1, 6, 7);
        lst.stream().filter(predicate).map(function).forEach(consumer);
        lst.stream().filter(i -> i % 3 == 0).map(j -> j*4).forEach(System.out::println);
    }
}
