import java.util.*;

class Student implements Comparable<Student> {
    int marks;
    String name;

    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {   // FIXED spelling
        System.out.println("............");
        return this.marks - s.marks;   // ascending order
    }
}

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();   // FIXED type

        list.add(new Student(85, "ff"));
        list.add(new Student(86, "fwtyf"));
        list.add(new Student(89, "fef"));

        Collections.sort(list);   // FIXED class name

        for (Student a : list) {
            System.out.println(a.marks + " " + a.name);
        }
    }
}
