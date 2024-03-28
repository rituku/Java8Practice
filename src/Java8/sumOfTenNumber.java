package Java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class sumOfTenNumber {
    public static void main(String[] args) {
        int sum = IntStream.range(1, 11).sum();
        System.out.println(sum);
    }
}
