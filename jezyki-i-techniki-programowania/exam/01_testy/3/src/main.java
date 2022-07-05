public class main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[8];
        animals[0] = new Monkey();
        animals[1] = new Monkey();
        animals[2] = new Lion();
        animals[3] = new Monkey();
        animals[4] = new Lion();
        animals[5] = new Lion();
        animals[6] = new Monkey();
        animals[7] = new Monkey();

        for (Animal animal : animals){
            Animal animal_test = animal.getAnimal(animal.name);
            //System.out.println(animal_test);
        }
    }
}
