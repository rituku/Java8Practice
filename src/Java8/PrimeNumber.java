package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PrimeNumber {
    static Predicate<Integer> p = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integers) {
            return IntStream.rangeClosed(2, integers/2).noneMatch(i -> integers%i == 0);
        }
    };
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 8, 3, 4, 2, 7, 9);
        list.stream().filter(p).forEach(System.out::println);
    }
}
