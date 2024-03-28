package practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Java8Function {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(3, 2, 8, 4, 1);

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*3;
            }
        };
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 10;
            }
        };

        lst.stream().filter(predicate).map(function).forEach(consumer);
        lst.stream().filter(i -> i%3==0).map(x -> x+1).forEach(System.out::println);

        System.out.println(lst.stream().reduce(binaryOperator).orElseGet(supplier));
    }
}
