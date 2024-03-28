package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface MethodReferance{
    void test();
}

interface AddInterface{
    int add(int a, int b);
}

interface Filter{
    List<Integer> filter(List<Integer> integerList);
}
public class MethodRefer {

    public static void methodRefer(){
        System.out.println("testing..");
    }

    public static int addMethod(int a, int b){
        return a + b;
    }

    public List<Integer> filterMethod(List<Integer> integerList){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<integerList.size(); i++){
            if(integerList.get(i) % 2 == 0){
                list.add(integerList.get(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        MethodReferance methodReferance = MethodRefer::methodRefer;
        methodReferance.test();

        AddInterface addInterface = MethodRefer::addMethod;
        System.out.println(addInterface.add(3, 2));

        List<Integer> arr = Arrays.asList(3, 4, 2, 1);
        MethodRefer methodRefer = new MethodRefer();
        Filter filterref = methodRefer::filterMethod;
        System.out.println(filterref.filter(arr));
    }
}
