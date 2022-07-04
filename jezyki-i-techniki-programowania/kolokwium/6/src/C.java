public class C {
    public int c1;
    public int c2;
    public final int var = 15;

    C(int c1, int c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public void m1() {

    }

    private void m2() {

    }

    public int getC1(){
        System.out.println("To jest metoda z C");
        return this.c1;
    }

    public int getC2(){
        System.out.println("To jest metoda z C");
        return this.c2;
    }
}
