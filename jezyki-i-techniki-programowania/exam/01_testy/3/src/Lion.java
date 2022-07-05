public class Lion extends Animal{
    public Lion() {
        super("Lion");
    }

    public Animal getAnimal(){
        System.out.println(name + " is eating meat");
        return new Lion();
    }
}
