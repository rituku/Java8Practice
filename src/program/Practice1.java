package program;

public class Practice1 {
    public static void main(String[] args) {
        String st = "gfgbbbbcnhbbbcc";
        String st1 = "bbc";
        char ch[] = st.toCharArray();
        char ch1[] = st1.toCharArray();
        int count = 0;
        for (int i =0; i<ch.length;i++){
            if(ch[i] == ch1[0]){
                int k = 0;
                while ((k < ch1.length)){
                    if (ch[i+k] != ch1[k]){
                        break;
                    }
                    k++;
                }
                if (k > ch1.length-1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
