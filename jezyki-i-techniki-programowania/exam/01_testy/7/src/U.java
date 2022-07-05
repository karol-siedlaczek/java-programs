public class U {
    public static void m(int x) {
        --x;			//M1
        {
            int y = x;	//M2
            y = y + 2;	//M3
            y = y;
        }
        x = x;         //M4
    }

    public static void main(String args[]){
        int x = 3;			//A
        m(--x);			//B
    }
}
