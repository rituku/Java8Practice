package program;

public class PalindromeCheck {
    public static int isPalindrome(String str){
        char ch[] = str.toCharArray();
        int strLen = 0;
        for(int i = 0; i<= ch.length/2; i++){
            if(ch[i] != ch[ch.length-1-i]){
                break;
            }
            if (ch.length/2 == i){
                strLen = str.length();
            }
        }
        return strLen;
    }
    public static void main(String[] args) {
        String st = "abaabbaa";
        String str = "";
        int n = st.length();
        int maxLen = Integer.MIN_VALUE;
        char ch[] = st.toCharArray();

       for (int i = 0; i < n; i++){
            for (int j = i; j < n;j++){
                str = "";
                for (int k = i; k <= j; k++){
                    str = str + ch[k];
                    int palindromLength = isPalindrome(str);
                   // int palindromLength = maxLength(length);
                    if (palindromLength > maxLen){
                        maxLen = palindromLength;
                    }
                }
                System.out.println(str);
            }
        }
       System.out.println("maxLen =="+maxLen);
    }
}
