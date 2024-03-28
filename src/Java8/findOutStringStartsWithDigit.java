package Java8;

import java.util.Arrays;
import java.util.List;

public class findOutStringStartsWithDigit {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        listOfStrings.stream().filter(i -> Character.isDigit(i.charAt(0))).forEach(System.out::println);
    }
}
