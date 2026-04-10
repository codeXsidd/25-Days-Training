import java.util.*;

class Student {
    int marks;
    String name;

    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    // Inner Comparator class
    static class myTask implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return a.marks - b.marks;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(85, "ff"));
        list.add(new Student(86, "fwtyf"));
        list.add(new Student(89, "fef"));

        Collections.sort(list, new Student.myTask());  // FIXED

        for (Student a : list) {
            System.out.println(a.marks + " " + a.name);
        }
    }
}
