import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String input = "hkjhj hkrrit";
        /*Character ch = st.chars().mapToObj(i -> (Character.toLowerCase(Character.valueOf((char) i))))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() == 1L)
                .map(i -> i.getKey()).findFirst().get();*/
       /* Character ch = str.chars().mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).
                entrySet().stream().filter(i -> i.getValue() == 1L).map(i -> i.getKey()).findFirst().get();
*/
        List<String> output = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() >= 1)
                .map(e -> e.getKey()).collect(Collectors.toList());

        System.out.println(output);

    }
}