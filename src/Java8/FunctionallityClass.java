package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FunctionallityClass {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee( "ritu", 876655));
        emp.add(new Employee( "somit", 64387309));
        emp.add(new Employee( "baby", 246545));

        Optional<Employee> maxSalaryEmp = Optional.of(emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get());
      //  System.out.println(maxSalaryEmp);

        Optional<Employee> emp2 = emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst();
       // System.out.println(emp2.map());
        emp.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));

    }
}
