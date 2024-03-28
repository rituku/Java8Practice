package java2023;

import java.util.Arrays;
import java.util.List;

public class SkipAndLimit {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 2, 1, 7, 8);
        list.stream().skip(2).limit(2).forEach(System.out::println);
        list.stream().skip(2).limit(2).map(i -> i*2).forEach(System.out::println);
    }
}
