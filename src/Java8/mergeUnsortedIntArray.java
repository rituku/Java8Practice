package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class mergeUnsortedIntArray {
    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
        System.out.println(Arrays.toString(c));

        List<Integer> list = Arrays.asList(7, 5, 7, 1);
        List<Integer> list1 = Arrays.asList(0, 5, 8, 1);
        Stream.concat(list.stream(), list1.stream()).collect(Collectors.toList()).stream().distinct().sorted().collect(Collectors.toList()).forEach(System.out::print);

    }
}
