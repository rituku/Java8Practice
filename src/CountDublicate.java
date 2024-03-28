import java.util.*;
import java.util.stream.Collectors;

public class CountDublicate {
    public static void main(String[] args) {
        String s = "Hi Ritu Rani Ritu";
        HashMap<Character, Integer> st = new HashMap<>();
        for (int i = s.length()-1; i>=0;i--){
            if(st.containsKey(s.charAt(i))){
               int count = st.get(s.charAt(i));
               st.put(s.charAt(i), ++count);
            } else {
               st.put(s.charAt(i), 1);
            }
        }
       // System.out.println(st);

        Map<String, Long> map1 = Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(sp -> sp, LinkedHashMap::new, Collectors.counting()));
        System.out.println(map1);

        Map<String, Long> m = Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(r -> r, TreeMap::new, Collectors.counting()));
        System.out.println(m);

        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result = items.stream().collect(Collectors.groupingBy(s1 -> s1, Collectors.counting()));
        System.out.println(result);

    }
}
