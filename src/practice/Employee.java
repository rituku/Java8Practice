package practice;

import java.util.Comparator;

public class Employee {

    private int id;
    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode(){
        return this.getId();
    }

    @Override
    public boolean equals(Object obj){
        Employee e1 = null;
        if (obj instanceof Employee){
            e1 = (Employee) obj;
        }
        if (this.name.equals(e1.getName())){
            return false;
        }else {
            return false;
        }
    }

    public static Comparator<Employee> byId = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.id - o2.id;
        }
    };

    public static Comparator<Employee> byName = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
