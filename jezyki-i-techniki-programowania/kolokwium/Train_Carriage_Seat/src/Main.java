public class Main {
    public static void main(String[] args){
        Train train1 = new Train();
        Carriage carriage1 = new Carriage();
        Carriage carriage2 = new Carriage();

        Seat seat1 = new Seat(1,false); // to siedzenie
        Seat seat2 = new Seat(2,false);
        Seat seat3 = new Seat(3,true);
        Seat seat4 = new Seat(4,false);
        Seat seat5 = new Seat(5,false);
        Seat seat6 = new Seat(6,false);
        Seat seat7 = new Seat(1, true);
        Seat seat8 = new Seat(2,true);
        Seat seat9 = new Seat(3,false);
        Seat seat10 = new Seat(4,false);
        Seat seat11 = new Seat(5,true);

        carriage1.add(seat1);
        carriage1.add(seat2);
        carriage1.add(seat3);
        carriage1.add(seat4);
        carriage1.add(seat5);
        carriage1.add(seat6);

        carriage2.add(seat6);
        carriage2.add(seat7);
        carriage2.add(seat8);
        carriage2.add(seat9);
        carriage2.add(seat10);
        carriage2.add(seat11);

        train1.add(carriage1);
        train1.add(carriage2);
        for (Seat seat : train1.freeDouble()){
            System.out.println(seat.number);
        }
    }
}
