public class H extends J{
    static int stH = stJ;
    int a;

    H() {
        ++J.stJ;
        ++stH;
        a = stH;
    }

    public int m(int x) {
        x = ++x;
        return x;
    }

    public static void main(String[] args) {
        System.out.println("J.stJ = " + J.stJ);
        System.out.println("H.stH = " + H.stH);
        H o1 = new H();
        System.out.println("J.stJ = " + J.stJ);
        H o2 = new H();
        System.out.println("o1.a = " + o1.a);
        System.out.println("o2.a = " + o2.a);
        System.out.println("J.stJ = " + J.stJ);
        System.out.println("H.stJ = " + H.stH);
        int x;
        System.out.println("o1.m(x) = " + o1.m(x = 3));
        System.out.println("o2.m(x) = " + o2.m(x));
        System.out.println("x = " + x);
        System.out.println("o2.a = " + o2.a);
        System.out.println("H.stH = " + H.stH);
    }
}
