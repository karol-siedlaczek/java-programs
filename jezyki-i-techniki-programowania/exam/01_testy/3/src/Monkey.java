public class Monkey extends Animal{
    public Monkey() {
        super("Monkey");
    }

    public Animal getAnimal(){
        System.out.println(name + " is eating fruits");
        return new Monkey();
    }
}
