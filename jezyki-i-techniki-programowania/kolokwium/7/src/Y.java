public class Y {
    public static void main(String args[]) {
        int j = 0;
        for (int i= 0; i <= 7; i++) {
            try {
                j = i;
                System.out.println(j/(5 - j) + ", ");
            }
            catch(Exception e) {
                System.out.println("Exception for j=" + j);
            }
        }


        try {
            for (int i = 0; i <= 5; i++) {
                j = i;
                System.out.println(j/(3 - j) + ", ");
            }
        }
        catch (Exception e) {
            System.out.println("Exception for j=" + j);
        }
    }
}
