import java.util.*;

public class CompareObject {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1, "ritu"));
        emp.add(new Employee(4, "somit"));
        emp.add(new Employee(2, "baby"));

        Collections.sort(emp, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getId() - o2.getId();
            }
        });
       // System.out.println(emp);
        Collections.sort(emp, ((o1, o2) -> {return o1.getId()-o2.getId();}));
       // System.out.println(emp);

        emp.stream().sorted((o1, o2) -> o1.getId()-o2.getId()).forEach(System.out::println);
        emp.stream().sorted((o1, o2) -> o2.getId()-o1.getId()).forEach(System.out::println);
        emp.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        emp.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);

        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(2, new Employee(5, "ritu"));
        employeeMap.put(7, new Employee(1, "rita"));
        employeeMap.put(4, new Employee(3, "somit"));

        List<Map.Entry<Integer, Employee>> ml = new ArrayList<>(employeeMap.entrySet());
       // ml.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        Collections.sort(ml, ((o1, o2) -> {return o1.getValue().getId()-o2.getValue().getId();}));
        //System.out.println(ml);

       // employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName))).forEach(System.out::println);

        List<Map.Entry<Integer, Employee>> mpl = new ArrayList<>(employeeMap.entrySet());
        Collections.sort(mpl, new Comparator<Map.Entry<Integer, Employee>>() {
            @Override
            public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                //return o1.getValue().getId() - o2.getValue().getId();
                return o1.getValue().getName().compareTo(o2.getValue().getName());
            }
        });
        System.out.println(mpl);

        Collections.sort(mpl, (o1, o2) -> o1.getValue().getId()-o2.getValue().getId());
        System.out.println(mpl);

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName).reversed())).forEach(System.out::println);

        List<String> lstf = Arrays.asList("ffg", "drrf", "iiiiu");
        lstf.stream().sorted().forEach(System.out::println);

        Collections.sort(lstf, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(lstf);

        Collections.sort(lstf, ((o1, o2) -> o1.compareTo(o2)));
        System.out.println(lstf);

    }
}
