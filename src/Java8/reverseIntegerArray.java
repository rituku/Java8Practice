package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class reverseIntegerArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        int[] reverseArray = IntStream.range(0, array.length).map(i -> array[array.length-i-1]).toArray();
        System.out.println(Arrays.toString(reverseArray));

        String str = "Hi Ritu";
        IntStream.range(0, str.length()).map(i -> str.length()-1-i).mapToObj(i -> str.charAt(i)).forEach(System.out::print);
    }
}
