package Java8;

import java.util.Arrays;
import java.util.List;

public class commanElement {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(4, 8, 4, 1, 9);
        List<Integer> lst2 = Arrays.asList(6, 5, 8, 0);
        lst1.stream().filter(lst2::contains).forEach(System.out::println);

        List<Integer> lst3 = Arrays.asList(4, 8, 4, 1, 9);
        List<Integer> lst4 = Arrays.asList(6, 5, 0, 4);
        lst3.stream().filter(lst4::contains).forEach(System.out::print);
    }
}
