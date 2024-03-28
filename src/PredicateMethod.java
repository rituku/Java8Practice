import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateMethod {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 1, 5);
        Predicate<Integer> p = new Predicate<Integer>(){
          public boolean test(Integer i){
              return i>1;
          }
        };

        Function<Integer, Integer> f = new Function<Integer, Integer>(){
            public Integer apply(Integer i){
                return i*2;
            }
        };

        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };
        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        list.stream().filter(p).map(f).forEach(c);
        list.stream().filter(i -> i%5 == 0).forEach(c);

        System.out.println(list.stream().map(i -> i*3).reduce(0, (a, e) -> a+e));

    }
}
