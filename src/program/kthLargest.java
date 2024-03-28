package program;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class kthLargest {

    static int findkthlargest(List<Integer> lt, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.addAll(lt.subList(0, k));

        for (int i = k; i < lt.size(); i++) {
            if(lt.get(i) > queue.peek()) {
                queue.poll();
                queue.add(lt.get(i));
            }
        }

        return queue.peek();
    }

    public static void main(String[] args) {

        //int[] arr = {7, 4, 6, 3, 9, 1};
        List<Integer> lt = Arrays.asList(7, 4, 6, 3, 9, 1);

        int out = findkthlargest(lt, 3);
        System.out.println(out);
    }
}
