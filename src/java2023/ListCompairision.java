package java2023;

import java.util.*;

public class ListCompairision {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(6, "ritu"));
        emp.add(new Employee(2, "somit"));
        emp.add(new Employee(8, "nandu"));

       /* Collections.sort(emp, Employee.byId);
        for (Employee e : emp){
            System.out.println(e);
        }
        System.out.println("--------------");
        Collections.sort(emp, Employee.byName);
        for (Employee e : emp){
            System.out.println(e);
        }*/

        Map<Integer, Employee> m = new HashMap<>();
        m.put(0, new Employee(6, "somit"));
        m.put(2, new Employee(4, "ritu"));
        m.put(1, new Employee(2, "nandu"));
        m.put(3, new Employee(3, "siva"));

        List<Map.Entry<Integer, Employee>> entryList = new ArrayList<>(m.entrySet());
        /*Collections.sort(entryList, new Comparator<Map.Entry<Integer, Employee>>(){

            @Override
            public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                return (o1.getKey().compareTo(o2.getKey()));
            }
        });
        System.out.println(entryList);*/
        /*Collections.sort(entryList, new Comparator<Map.Entry<Integer, Employee>>() {
            @Override
            public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                return (o1.getValue().getName()).compareTo ((o2.getValue().getName()));
            }
        });
        System.out.println(entryList);*/
        Collections.sort(entryList, (o1, o2) -> (o1.getValue().getName()).compareTo((o2.getValue().getName())));
        System.out.println(entryList);



    }
}
