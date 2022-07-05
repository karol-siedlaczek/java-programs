public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(30);
        Item item2 = new Item(1);
        Item item3 = new Item(23);
        Item item4 = new Item(35); // 89
        Item item5 = new Item(15);
        Item item6 = new Item(76);
        Item item7 = new Item(11);
        Item item8 = new Item(98); // 200

        Drawer drawer1 = new Drawer();
        Drawer drawer2 = new Drawer();

        drawer1.add(item1);
        drawer1.add(item2);
        drawer1.add(item3);
        drawer1.add(item4);

        drawer2.add(item5);
        drawer2.add(item6);
        drawer2.add(item7);
        drawer2.add(item8);

        Shelf shelf = new Shelf();
        shelf.add(drawer1);
        shelf.add(drawer2);

        for (Drawer drawer : shelf.toBeLocked(10)) {
            System.out.println(drawer);
        }
    }
}
