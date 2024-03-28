package practice;

import java.util.*;

public class CompareArrayList{
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ritu"));
        employees.add(new Employee(2, "Rani"));

        Collections.sort(employees, Employee.byId);

        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee(2, "ritu"));
        employeeMap.put(3, new Employee(7, "somit"));
        employeeMap.put(2, new Employee(4, "advika"));
        employeeMap.put(8, new Employee(3, "nandini"));

        List<Map.Entry<Integer, Employee>> maplist = new ArrayList<>(employeeMap.entrySet());
        Collections.sort(maplist, new Comparator<Map.Entry<Integer, Employee>>() {
            @Override
            public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                return o1.getKey() - o2.getKey();
            }
        });

       // System.out.println(maplist);

        Collections.sort(maplist, new Comparator<Map.Entry<Integer, Employee>>() {
            @Override
            public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                return o1.getValue().getId() - o2.getValue().getId();
            }
        });

        //System.out.println(maplist);

        Collections.sort(maplist, new Comparator<Map.Entry<Integer, Employee>>() {
            @Override
            public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                return o1.getValue().getName().compareTo(o2.getValue().getName());
            }
        });

       // System.out.println(maplist);

        maplist.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("----------------");
        maplist.stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName))).forEach(System.out::println);
        System.out.println("----------------");
        maplist.stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getId))).forEach(System.out::println);

        System.out.println("----------------");
        Collections.sort(maplist, (o1, o2) -> o1.getValue().getName().compareTo(o2.getValue().getName()));
        System.out.println(maplist);


    }


}
