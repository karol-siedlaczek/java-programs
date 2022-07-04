public class D extends C{
    private int c1;
    public int c2;
    public final int var = 25;

    D(int c1, int c2) {
        super(c1, 10000);
        this.c2 = c2;
    }

    public void m1() {
        System.out.println("D: m1()");
    }

    public void m2() {
        System.out.println("D: m2()");
    }

    public int getC1(){
        System.out.println("To jest metoda z D");
        return super.c1;
    }

    public int getC2(){
        System.out.println("To jest metoda z D");
        return this.c2;
    }
}
