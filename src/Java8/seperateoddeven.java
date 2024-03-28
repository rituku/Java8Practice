package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class seperateoddeven {
    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(2, 5, 4, 7, 8, 1);
        Map<Boolean, List<Integer>> lst1 = lst.stream().collect(Collectors.partitioningBy(i -> i%2 == 0));

        Set<Map.Entry<Boolean, List<Integer>>> set = lst1.entrySet();
        for (Map.Entry<Boolean, List<Integer>> map1 : set){
            if(map1.getKey()){
                System.out.println("Even ");
                System.out.println(map1.getValue());
            }
            else {
                System.out.println("Odd ");
                System.out.println(map1.getValue());
            }
        }

    }
}
