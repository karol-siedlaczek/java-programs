public class main {
    public static void main(String[] args) {
        C c = new D(50, 100);
        D d = new D(5, 10);
        System.out.println(c.var);
        System.out.println(c.c2);
        System.out.println(d.var);
        //System.out.println(d.var);
        System.out.println(c.getC1());
        System.out.println(c.getC2());
        //System.out.println(d.getC1());
       // System.out.println(d.getC2());
    }
}
