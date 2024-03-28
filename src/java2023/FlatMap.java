package java2023;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> lst = Arrays.asList(Arrays.asList(3, 1, 6, 2), Arrays.asList(8, 1, 3, 5), Arrays.asList(2, 7, 4));
        lst.stream().flatMap(ls -> ls.stream()).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();
        lst.stream().flatMap(lsm -> lsm.stream().map(i -> i*2)).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();
        lst.stream().flatMap(lt -> lt.stream().map(i -> i+2).filter(i -> i > 6)).collect(Collectors.toList()).forEach(System.out::print);


        List<String> lts = Arrays.asList("ritu", "somit", "kumar");
        String s = lts.stream().collect(Collectors.joining("."));
        System.out.println(s);

        Map<Character, String> map = lts.stream().collect(Collectors.toMap(str -> str.charAt(0), String::toUpperCase));
        System.out.println(map);

        List<List<String>> lst1 = Arrays.asList(Arrays.asList("ritu", "somit", "Kumar"), Arrays.asList("Nandu", "Ritu", "kumar"), Arrays.asList("Anaira", "Somit", "Rani"));
        Map<String, Integer> map1 = lst1.stream().flatMap(l -> l.stream().filter(sm -> !sm.startsWith("K"))).collect(Collectors.toMap(lm -> lm, l -> l.toCharArray().length));
        System.out.println(map1);



    }
}
