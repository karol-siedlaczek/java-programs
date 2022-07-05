import java.util.ArrayList;
public class Degree{
    ArrayList<Course> courses = new ArrayList<>();

    void add(Course course) {
        courses.add(course);
    }

    public boolean contains(ArrayList<Course> courses) {
        for (Course course : courses) {
            for (Student student : course.students) {
                return true;
            }
        }
        return false;
    }

    ArrayList<Student> betterStudents() throws VerifyError{
        if (!this.contains(this.courses))
            throw new VerifyError("no students");
        ArrayList<Student> betterStudentsList = new ArrayList<>();
        double avgMark;
        int sumMarks = 0;
        int sumStudents = 0;
        for (Course course : this.courses) {
            for (Student student : course.students) {
                sumMarks += student.mark;
                sumStudents++;
            }
        }
        avgMark = sumMarks / (double) sumStudents;
        for (Course course : this.courses) {
            for (Student student : course.students) {
                if (student.mark > avgMark){
                    betterStudentsList.add(student);
                }
            }
        }
        return betterStudentsList;
    }

}
