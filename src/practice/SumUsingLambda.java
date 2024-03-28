package practice;

import java2023.SumInterface;
interface SumMethod{
    int sum(int a, int b);
}
public class SumUsingLambda {
    public static void main(String[] args) {
        SumMethod sumMethod = (a, b) ->  a + b;
        sumMethod.sum(3, 7);

    }
}
