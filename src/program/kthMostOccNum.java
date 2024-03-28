package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class kthMostOccNum {

        static ArrayList<Integer>findKthMostOccurring(
            ArrayList<Integer> arr, int K)
        {

            // Initializing a dictionary
            HashMap<Integer, Integer> d = new HashMap<>();

            // Iterating through the array
            for(int i = 0; i < arr.size(); i++)
            {

                // If the element is not in the dictionary, adding it with the frequency as 1
                if (!d.containsKey(arr.get(i)))
                    d.put(arr.get(i), 1);

                    // If the element is already present in the dictionary, increment its frequency
                else
                {
                    int temp = d.get(arr.get(i));
                    temp += 1;
                    d.put(arr.get(i), temp);
                }
            }

            // Now, the dictionary signifies the number of unique elements. If the count of this is less than K, then we cant find
            // the elements whose occurrence is  K-th most occurring.
            if (d.size() < K)
                return new ArrayList<Integer>();

            // Initializing a new dictionary to store the elements according to their frequency
            HashMap<Integer, ArrayList<Integer>> occu = new HashMap<Integer,ArrayList<Integer>>();

            // Iterating through the dictionary
            for(Map.Entry<Integer, Integer> freq : d.entrySet())
            {

                // If the element is not in the dictionary, then store the element in an array
                // with key as the frequency
                if (!occu.containsKey(freq.getValue()))
                {
                    occu.put(freq.getValue(),new ArrayList<Integer>());
                    occu.get(freq.getValue()).add(freq.getKey());
                }

                // Else, add the element to the array of elements
                else
                {
                    occu.get(freq.getValue()).add(freq.getKey());
                }
            }

            // Since the dictionary is sorted and not indexed, find (M - K)-th element where M is the length
            // of the dictionary
            K = occu.size() - K;

            // Since we for sure know that the element exists, we iterate through the dictionary and
            // return the element
            for(Map.Entry<Integer,
                    ArrayList<Integer>> a : occu.entrySet())
            {
                if (K == 0)
                    return a.getValue();

                K -= 1;
            }
            return new ArrayList<Integer>();
        }

        // Driver code
        public static void main(String[] args)
        {
            ArrayList<Integer> arr = new ArrayList<Integer>(
                    Arrays.asList(1, 4, 4, 4, 2, 2, 2, 5, 5,
                            5, 5, 5, 7, 7, 8, 8, 8, 8));

            int K = 2;
            ArrayList<Integer> a = new ArrayList<Integer>(
                    findKthMostOccurring(arr, K));

            System.out.print("[");
            for(int i = 0; i < a.size() - 1; i++)
            {
                System.out.print(a.get(i) + ", ");
            }

            if (a.size() >= 1)
                System.out.print((int)a.get(
                        a.size() - 1) + "]");
        }

}
