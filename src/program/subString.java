package program;

public class subString {
    public static void main(String[] args) {
        String s = "vaabbccaaccaaabcbaab";
        String sb = "aab";
        char ch[] = s.toCharArray();
        char ch1[] = sb.toCharArray();
        int count = 0;

        for (int i = 0; i< ch.length; i++){

            if(ch[i] == ch1[0]){
                int k = 1;
                while (k < ch1.length){
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
