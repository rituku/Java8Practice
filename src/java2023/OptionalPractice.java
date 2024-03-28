package java2023;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(4, 2, 7, 5, null, 1);
        Optional<Integer> optional = Optional.empty();
        System.out.println(optional);

        Optional<Integer> opts = Optional.ofNullable(null);
        System.out.println(opts);

        for (int i = 0; i < lst.size(); i++){
            Optional<Integer> opt = Optional.ofNullable(lst.get(i));
            System.out.println(opt.orElseGet(() -> 111100));
        }

    }
}
