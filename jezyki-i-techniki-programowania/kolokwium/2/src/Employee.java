public class Employee extends Person {
    String company;

    Employee(String name, Boolean sex, String company) {
        super(name, sex);
        this.company = company;
    }
}
