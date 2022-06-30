public class Person{
    String name;
    Boolean sex;

    Person(String name, Boolean sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString(){
        String result;
        if (sex) {
            result = "boy";
        }
        else {
            result = "girl";
        }
        return this.name + "is " + result;
    }

    public static void main(String[] args) {

    }
}
