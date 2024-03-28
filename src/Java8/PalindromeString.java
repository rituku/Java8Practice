package Java8;

import java.util.stream.IntStream;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "ROTATOR";
        boolean isPalindrom = IntStream.range(0, str.length()/2).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - 1-i));
        System.out.println(isPalindrom);
    }
}
