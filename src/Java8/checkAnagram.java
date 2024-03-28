package Java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class checkAnagram {
    public static void main(String[] args) {
        String s1 = "Peek";
        String s2 = "Keep";
        String s11 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining(""));
        String s22 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining(""));

        if (s11.equals(s22)){
            System.out.println("Is Anagram");
        } else {
            System.out.println("Is Not Anagram");
        }

    }
}
