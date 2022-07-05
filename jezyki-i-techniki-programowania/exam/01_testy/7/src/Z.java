public class Z {
    public static void main(String[] args){

        int x = -3;		    //A
        x = x * 2;			//B
        {
            int z = x +3;	//C
            x = x - z;		//D
        }				    //E
        x = x;
        --x;				//F

    }
}
