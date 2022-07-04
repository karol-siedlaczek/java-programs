public class main {
    public static void main(String[] args) {
        Person person1 = new Employee("Monika", false, "Corp", 10);
        // Person person2 = new Person("Jacek", true);
        // System.out.println(person1.getSex());
        Employee employee1 = new Employee("Jacek", true, "Firma", 15);
        employee1.ShowSmth();


        Employee employee2 = new Employee("Marcik", true, "Korporacja", 50);


        employee1.clone();
        //employee2.ShowSmth();
        // System.out.println(employee1.test3());
        // System.out.println(employee1.test4());
        // System.out.println(employee1.getTestowa_zmienna());
        jakDzialaWiazanie(employee1);
        jakDzialaWiazanie(person1);
        /*
        int j = 0;
        try {
            for (int i = 0; i <=5; i++) {
                j = i;
                System.out.println(j/(3-j) + ", ");
            }
        }
        catch(Exception e) {
            System.out.println("Exception for j=" + j);
            System.out.println((e));
        }
        */
    }

    public static void jakDzialaWiazanie(Person obj) {
        System.out.println(obj.testowa_zmienna);
        System.out.println(obj.getSex());
    }
}
