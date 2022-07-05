public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        Course course2 = new Course();
        Course course3 = new Course();
        Student student1 = new Student(3);
        Student student2 = new Student(4);
        Student student3 = new Student(1);
        Student student4 = new Student(1);
        Student student5 = new Student(1);
        Student student6 = new Student(2);
        Student student7 = new Student(1);
        Student student8 = new Student(5);
        Student student9 = new Student(7);
        Student student10 = new Student(6);
        course1.add(student1);
        course1.add(student2);
        course1.add(student3);
        course2.add(student4);
        course2.add(student5);
        course2.add(student6);
        course2.add(student7);
        course3.add(student8);
        course3.add(student9);
        course3.add(student10);
        Degree degree1 = new Degree();
        /*degree1.add(course1);
        degree1.add(course2);
        degree1.add(course3);*/
        for (Student student : degree1.betterStudents()){
            System.out.println(student.mark);
        }
    }
}
