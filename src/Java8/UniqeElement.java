package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqeElement {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        listOfStrings.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
    }
}
