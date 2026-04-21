import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int rno;
    transient int age; // transient: not stored during serialization

    Student(String name, int rno, int age) {
        this.name = name;
        this.rno = rno;
        this.age = age;
    }
}
