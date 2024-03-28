package Java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class sumOfAllDigit {
    public static void main(String[] args) {
        int num = 3421;
        //Integer sumDigit = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

       // Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

      //  System.out.println(sumOfDigits);
        Integer ans = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(ans);
        String s = String.valueOf(num);
        Boolean b = s.equals("3421");
        System.out.println(s+"----"+b);
    }
}
