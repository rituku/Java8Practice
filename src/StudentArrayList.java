import java.util.*;

public class StudentArrayList {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(3, 2, 9, 5, 1);
        Collections.sort(lst, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

       // System.out.println(lst);

        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "ritu"));
        students.add(new Student(6, "rita"));
        students.add(new Student(2, "somit"));

        Collections.sort(students);
        System.out.println(students);

    }
}
