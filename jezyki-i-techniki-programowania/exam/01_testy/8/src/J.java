public class J implements Cloneable{
    int a;
    static int stJ = 0;

    public J() {
        ++stJ;
        a = stJ;
    }

    public int m(int x) {
        return 2 + --x;
    }
}
