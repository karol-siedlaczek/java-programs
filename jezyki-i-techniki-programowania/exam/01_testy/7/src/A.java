class A {
    int a;
    static int stA = 0;

    public A() {
        a = ++stA;
    }

    public int n(int x){
        System.out.println("nie nadpisana metoda");
        return x + 3;
    }
}
