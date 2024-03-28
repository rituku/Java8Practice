package Java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class fisrtnonrep {
    public static void main(String[] args) {
        String  s = "hi ritu rani";
        Character ch = s.chars().mapToObj(i -> (Character.valueOf((char) i)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() == 1L).map(i -> i.getKey()).findFirst().get();

        Map<Character, Long> map = s.chars().mapToObj(i -> (Character.valueOf((char) i))).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().filter(x -> x.getValue() == 1L).map(i -> i.getKey()).findFirst();
        System.out.println(ch);

        int arr[] = new int[] {1, 1, 3, 6, 2, 3};
        List<Integer> arrays = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Map<Integer, Long> map3 = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map3);
    }
}
