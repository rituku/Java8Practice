import java.util.Comparator;

public class Employee {

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
        public int hashCode(){
            return this.getId();
    }

    @Override
    public boolean equals(Object obj){
        Employee e1 = null;
        if(obj instanceof Employee){
            e1 = (Employee) obj;
        }
        if(this.getName().equals(e1.getName())){
            return false;
        }else {
            return false;
        }
    }

 /*   public static Comparator<Employee> byId = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.id - o2.id;
        }
    };

    public static Comparator<Employee> byName = new Comparator<Employee>(){
        public int compare(Employee o1, Employee o2){
            return o1.name.compareTo(o2.name);
        }
    };*/
}
