public class Student implements Comparable<Student>{
    public Student(int id, String name) {
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
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    int id;
    String name;

    @Override
    public int compareTo(Student o) {
        if(o.id == id){
            return 0;
        }
        else if(o.id > id){
            return -1;
        }else {
            return 1;
        }
    }
}


