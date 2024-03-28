import java.util.*;

public class ArrayListCompare {

    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1, "ritu"));
        emp.add(new Employee(4, "somit"));
        emp.add(new Employee(2, "baby"));

        /*Collections.sort(emp, Employee.byId);

        for (Employee employee : emp){
            System.out.println(employee);
        }

        Collections.sort(emp, Employee.byName);

        for (Employee employee: emp){
            System.out.println(employee);
        }*/

        Map<Integer, Employee> map = new HashMap<Integer, Employee>();
        map.put(1, new Employee(2, "rita"));
        map.put(5, new Employee(1, "soma"));
        map.put(3, new Employee(5, "mitrit"));
        map.put(2, new Employee(3, "baby"));
        map.put(4, new Employee(4, "baby"));

        List<Map.Entry<Integer, Employee>> entryList = new ArrayList<Map.Entry<Integer, Employee>>(map.entrySet());

       /* Collections.sort(entryList, new Comparator<Map.Entry<Integer, Employee>>() {
            @Override
            public int compare(Map.Entry<Integer, Employee> e1, Map.Entry<Integer, Employee> e2){
                return (e1.getKey().compareTo(e2.getKey()));
            }
        });*/


          Collections.sort(entryList, new Comparator<Map.Entry<Integer, Employee>>() {

          @Override public int compare(Map.Entry<Integer, Employee> o1,
          Map.Entry<Integer, Employee> o2) { return (o1.getValue().getId() -
          o2.getValue().getId()); // return
         // o1.getValue().name.compareTo(o2.getValue().name);
          }; });
         //System.out.println(entryList);

        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Employee>>() {

            public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2){
                return (o1.getValue().getName().compareTo(o2.getValue().getName()));
            }
        });
        //System.out.println(entryList);

        /*  Collections.sort(entryList, new Comparator<Map.Entry<Integer, Employee>>() {

          @Override public int compare(Map.Entry<Integer, Employee> o1,
          Map.Entry<Integer, Employee> o2) { return (o1.getValue().id -
          o2.getValue().id); } });*/
      //  System.out.println(entryList);
        Collections.sort(entryList, (o1, o2) -> o1.getValue().getName().compareTo(o2.getValue().getName()));
        //System.out.println(entryList);
        //entryList.stream().sorted((o1, o2) -> o1.getValue().getName().compareTo(o2.getValue().getName())).forEach(System.out::println);
        //map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName))).forEach(System.out::println);
        Collections.sort(entryList, (o1, o2) -> o2.getValue().getId() - o1.getValue().getId());
        System.out.println(entryList);
        Collections.sort(entryList, (o1, o2) -> o2.getValue().getName().compareTo(o1.getValue().getName()));
        System.out.println(entryList);
    }

}
