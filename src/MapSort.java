import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSort {
    private static class Employee {
        public String name;
        public int id;

        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }


        @Override
        public String toString() {
            return "Employee [name=" + name + ", id=" + id + "]";
        }



    }

    public static void main(String[] args) {
        Map<Integer, Employee> map = new HashMap<Integer, Employee>();

        map.put(2, new MapSort.Employee("x", 353));
        map.put(1, new MapSort.Employee("a", 45));
        map.put(3, new MapSort.Employee("f", 64));
        map.put(4, new MapSort.Employee("yu", 14));

        List<Map.Entry<Integer, Employee>> entryList = new ArrayList<Map.Entry<Integer, Employee>>(map.entrySet());

          Collections.sort(entryList, new Comparator<Map.Entry<Integer, Employee>>() {

          @Override public int compare(Map.Entry<Integer, Employee> o1,
          Map.Entry<Integer, Employee> o2) { return (o1.getValue().id -
          o2.getValue().id); // return
         // o1.getValue().name.compareTo(o2.getValue().name);
          }; });

        //   Collections.sort(entryList, (o1, o2) -> o1.getValue().name.compareTo(o2.getValue().name));
        // Collections.sort(entryList, (o1, o2) -> o1.getKey() - o2.getKey());

        //    map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        // map.entrySet().stream().sorted((o1, o2) -> o1.getValue().name.compareTo(o2.getValue().name)).forEach(System.out::println);
        // map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName))).forEach(System.out::println);
        /*
         * Collections.sort(entryList, new Comparator<Map.Entry<Integer, Employee>>() {
         *
         * @Override public int compare(Map.Entry<Integer, Employee>
         * integerEmployeeEntry, Map.Entry<Integer, Employee> integerEmployeeEntry2) {
         * return integerEmployeeEntry.getValue().name
         * .compareTo(integerEmployeeEntry2.getValue().name); } } );
         */

        //  System.out.println(entryList);
    }
}

