package java2023;

import java.util.Calendar;

public class SumUsingLambda {
    public static void main(String[] args) {
        SumInterface s = new SumInterface() {
            @Override
            public int sum(int a, int b) {
                System.out.println(a+b);
                return a+b;
            }
        };
        s.sum(3,6);

        SumInterface st = (a, b) -> a + b ;
        System.out.println(st.sum(3, 1));
    }
}
