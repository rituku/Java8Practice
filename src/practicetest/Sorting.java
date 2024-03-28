package practicetest;

import java.util.*;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        Map<Integer, Employee> map = new HashMap<>();
        map.put(4, new practicetest.Employee(6, "Ritu"));
        map.put(3, new practicetest.Employee(8, "Nandini"));
        map.put(2, new practicetest.Employee(2, "Somit"));

        List<Map.Entry<Integer, Employee>> arrayList = new ArrayList<Map.Entry<Integer, Employee>>(map.entrySet());
        arrayList.stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList()).forEach(System.out::println);

        arrayList.stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName))).collect(Collectors.toList()).forEach(System.out::println);
        Collections.sort(arrayList, (e1, e2) -> e1.getValue().id - e2.getValue().id);
        System.out.println(arrayList);



    }
}
