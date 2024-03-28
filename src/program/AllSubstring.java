package program;

public class AllSubstring {

    public static void printSubstrings(String str)
    {

        // finding the length of the string
        int n = str.length();

        // outermost for loop
        // this is for the selection
        // of starting point
        for (int i = 0; i < n; i++) {

            // 2nd for loop is for selection
            // of ending point
            for (int j = i; j < n; j++) {

                // 3rd loop is for printing from
                // starting point to ending point
                for (int k = i; k <= j; k++) {
                    System.out.print(str.charAt(k));
                }

                // changing the line after printing
                // from starting point to ending point
                System.out.println();
            }
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "abc";

        // calling method for printing substring
        printSubstrings(str);
    }
}
