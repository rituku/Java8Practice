package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class delimitersJoin {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        String str = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(str);
    }
}
