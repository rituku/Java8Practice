package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class listarray {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(4, 8, 4, 1, 9, 3, 4, 3);
       Map<Integer, Long> map = lst.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      System.out.println(map);
      // System.out.println(map.entrySet().stream().filter(i -> i.getValue() == 2L).map(i -> i.getKey()).findFirst().get());

        List<String> list = Arrays.asList("78", "9", "34", "6", "78");
        list.stream().map(i -> Integer.parseInt(i)).sorted(Collections.reverseOrder()).distinct().map(i -> i+"->a").forEach(System.out::println);
       // list.stream().map(i -> (Character.valueOf((char) i))).forEach(System.out::println);

    }
}
