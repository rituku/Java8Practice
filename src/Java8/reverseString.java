package Java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class reverseString {
    public static void main(String[] args) {
         String str = "Hi Ritu Rani";
         String st = Stream.of(str).map(i -> new StringBuilder(i).reverse()).collect(Collectors.joining());
         System.out.println(st);

        IntStream.range(0, str.length()).map(i -> (str.length())-1-i).mapToObj(i -> str.charAt(i)).forEach(System.out::print);

        System.out.println();
         String str1 = Stream.of(str.split(" ")).map(i -> new StringBuilder(i).reverse()).collect(Collectors.joining(" "));
         System.out.println(str1);
    }
}
