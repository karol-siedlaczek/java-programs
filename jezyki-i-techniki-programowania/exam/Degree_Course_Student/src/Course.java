import javax.management.AttributeList;
import java.util.ArrayList;

public class Course {
    ArrayList<Student> students = new ArrayList<>();

    void add(Student student) {
        students.add(student);
    }
}
