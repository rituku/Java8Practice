package java2023;

import java.util.HashMap;

public class CountChar {
    public static void main(String[] args) {
        String st = "this is Ritu Rani r";
        char ch[] = st.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<ch.length; i++){
            if (map.containsKey(ch[i])){
                map.put(ch[i], map.get(ch[i]) + 1);
            } else {
                map.put(ch[i], 1);
            }
        }

        System.out.println(map);
    }
}
