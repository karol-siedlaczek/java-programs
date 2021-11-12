import java.util.Arrays;

public class Line implements Figure{
    private double[] P1;
    private double[] P2;

    public Line(double x1,double y1,double x2,double y2){
        P1 = new double[2];
        P2 = new double[2];
        P1[0] = x1;
        P1[1] = y1;
        P2[0] = x2;
        P2[1] = y2;
    }

    @Override
    public void move(double dx, double dy){
        P1[0] = P1[0] + dx;
        P1[1] = P1[1] + dy;
        P2[0] = P2[0] + dx;
        P2[1] = P2[1] + dy;
    }

    @Override
    public void flip(){//CLASS LINE
        double a;
        a = P1[1];
        P1[1] = -P1[0];
        P1[0] = -a;
        a = P2[1];
        P2[1] = -P2[0];
        P2[0] = -a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Arrays.equals(P1, line.P1) &&
                Arrays.equals(P2, line.P2);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(P1);
        result = 31 * result + Arrays.hashCode(P2);
        return result;
    }

    @Override
    public String toString(){
        return("Line: px1: "+this.P1[0]+", y1: "+this.P1[1]+", x2: "+this.P2[0]+", y2: "+this.P2[1]+"\n");
    }
}