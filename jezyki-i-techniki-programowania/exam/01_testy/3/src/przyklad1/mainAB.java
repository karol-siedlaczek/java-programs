package przyklad1;

public class mainAB {
    public static void main(String[] args) {
        A[] elems = new A[4];
        elems[0] = new A();
        elems[1] = new B();
        elems[2] = new A();
        elems[3] = new B();

        for (A elem : elems){
            A elemSample = elem.m();
            System.out.println(elemSample);
        }
    }
}
