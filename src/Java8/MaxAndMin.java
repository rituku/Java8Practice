package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(4, 2, 1, 5, 3);
        Optional<Integer> max = lst.stream().max(Comparator.naturalOrder());
        System.out.println(max);

        int min = lst.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);
    }
}
