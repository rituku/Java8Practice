package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class nthMaximumNo {
    public static void main(String[] args) {
        List<Integer> thirdMax = Arrays.asList(7, 9, 4, 0, 2, 3);
        List<Integer> thirdMaxNo = thirdMax.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(thirdMaxNo);
        thirdMaxNo.stream().limit(3).skip(2).forEach(System.out::println);

        List<Integer> secondSmallest = Arrays.asList(7, 9, 4, 0, 2, 3);
        secondSmallest.stream().sorted().limit(2).skip(1).forEach(System.out::println);



    }
}
