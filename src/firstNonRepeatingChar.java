import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstNonRepeatingChar {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(3, 2, 8, 5, 2, 2);
        String str = "Hi Ritu Rani";
        Character ch = str.chars().mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).
                entrySet().stream().filter(i -> i.getValue() == 1L).map(i -> i.getKey()).findFirst().get();

        System.out.println(ch);
    }
}
