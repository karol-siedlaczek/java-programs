class B extends A {
    static int stB = 0;
    int a;

    B() {
        ++stB;
        System.out.println("jestem w konstruktorze B, stB = " + stB + ", A.stA = " + A.stA);
        a = stB * A.stA;
    }

    public int n(int x){
        System.out.println("nadpisana metoda");
        x = x * 3;
        return x;
    }

    public static void main(String[] args) {
        System.out.println("A.stA = " + A.stA);
        System.out.println("B.stB = " + B.stB);
        A x = new A();
        B y = new B();
        System.out.println("x.a = " + x.a);
        System.out.println("y.a = " + y.a);
        System.out.println("A.stA = " + A.stA);
        System.out.println("B.stB = " + B.stB);
        int z = 10;
        System.out.println("x.n(z) = " + x.n(z));
        System.out.println("y.n(--z) = " + y.n(--z));
        System.out.println("z = " + z);
        System.out.println("x.a = " + x.a);
        System.out.println("y.a = " + y.a);
    }
}