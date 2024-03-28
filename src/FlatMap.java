import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> lst = Arrays.
                asList(Arrays.asList(2, 3, 5), Arrays.asList(2, 8, 0), Arrays.asList(9, 3, 5));
        List<Integer> ls = lst.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        List<Integer> ls1 = lst.stream().flatMap(list -> list.stream().map(integer -> integer*2)).collect(Collectors.toList());

        List<String> lts = Arrays.asList("ritu", "somit", "kumar");

        String s = lts.stream().collect(Collectors.joining(","));
        System.out.println(s);
       // System.out.println(ls1);

        Map<Character, String> cs = lts.stream().collect(Collectors.toMap(str -> str.charAt(0), String::toUpperCase));
System.out.println(cs);

       List<List<String>> lstoflst = Arrays.asList(Arrays.asList("rItu", "rani"), Arrays.asList("Somit", "kumar"));
       lstoflst.stream().flatMap(lsm -> lsm.stream().map(String::toUpperCase).sorted().filter(i -> i.startsWith("S"))).collect(Collectors.toList()).forEach(System.out::println);

    }
}
