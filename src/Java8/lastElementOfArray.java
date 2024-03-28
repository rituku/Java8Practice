package Java8;

import java.util.Arrays;
import java.util.List;

public class  lastElementOfArray {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        String lastele = listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get();
        System.out.println(lastele);
    }
}
