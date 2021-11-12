public class Punkty {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Inter p1 = new Punkt(1,3);
        Inter p2 = new Punkt(3,4);

        System.out.println("P2 przed przesunieciem: "+p2.ToString());
        p2.Mov(1, -1);
        System.out.println("P2 po przesunieciu: "+p2.ToString());

        Linia l1 = new Linia(p1,p2);
        System.out.println("\nLinia:\n"+l1.ToString());

        l1.Mov(2, -3);
        System.out.println("\nLinia po przesunieciu:\n"+l1.ToString());
    }

}
