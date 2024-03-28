package program;

import java.util.*;

public class Practice {
    private static List mostOcc(List<Integer> lst, int kth) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i< lst.size(); i++){
            if(!hashMap.containsKey(lst.get(i))){
                hashMap.put(lst.get(i), 1);
            } else {
                hashMap.put(lst.get(i), hashMap.get(lst.get(i))+1);
            }
        }

        HashMap<Integer, ArrayList<Integer>> occ = new HashMap<Integer, ArrayList<Integer>>();
        for (Map.Entry<Integer, Integer> frq : hashMap.entrySet()){
            if(!occ.containsKey(frq.getValue())){
                occ.put(frq.getValue(), new ArrayList<Integer>());
                occ.get(frq.getValue()).add(frq.getKey());
            } else {
                occ.get(frq.getValue()).add(frq.getKey());
            }
        }

        kth = occ.size() - kth;
        for(Map.Entry<Integer,
                ArrayList<Integer>> a : occ.entrySet())
        {
            if (kth == 0)
                return a.getValue();

            kth -= 1;
        }
        return new ArrayList<Integer>();

    }
    public static void main(String[] args) {
        List lst = Arrays.asList(3, 1, 8, 5, 9, 1, 1, 3, 8, 5, 2, 2, 3);
       // List ls = mostOcc(lst, 2);
        ArrayList<Integer> a = new ArrayList<Integer>(
                mostOcc(lst, 2));

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
