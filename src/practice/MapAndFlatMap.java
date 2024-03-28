package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(4, 8, 7, 1), Arrays.asList(9, 6, 1));
        list.stream().flatMap(lst -> lst.stream()).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();
        list.stream().flatMap(ls -> ls.stream().map(i -> i*2).filter(x -> x>10)).collect(Collectors.toList()).forEach(System.out::print);
    }
}
