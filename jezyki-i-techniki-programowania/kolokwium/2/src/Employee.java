public class Employee extends Person implements Cloneable {

    static class InnerEmployee extends Person {
        String inner_name;
        InnerEmployee(String name) {
            super(name, false);
            this.inner_name = name;
        }
        @Override
        public void ShowSmth() throws NullPointerException{
            System.out.println("wlasnie Ci pokazuje stale dla: " + this.name);
            System.out.println(STALA);
        }

    }
    String company;
    Integer testowa_zmienna = 5;
    static Integer STALA = 15;

    Employee(String name, Boolean sex, String company, Integer dodatnia) {
        super(name, sex);
        this.company = company;
        this.STALA = this.STALA + dodatnia;
    }

    @Override
    public void ShowSmth(){
        System.out.println("wlasnie Ci pokazuje stale dla: " + this.name);
        System.out.println(STALA);
        System.out.println(this.STALA);
    }


    public String getSex(){
        String result;
        if (sex) {
            result = "BOY";
        }
        else {
            result = "GIRL";
        }
        return this.name + " is " + result;
    }

    Integer getTestowa_zmienna(){
        return this.testowa_zmienna;
    }

    public Object test3(){
        System.out.println("this.getSex()");
        return this.getSex();
    }

    public Object test4() {
        System.out.println("super.getSex()");
        return super.getSex();
    }

    @Override
    public Employee clone() {

        System.out.println("jestem w klonie");
        System.out.println(this.company);
        try {
            Employee clone = (Employee) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
