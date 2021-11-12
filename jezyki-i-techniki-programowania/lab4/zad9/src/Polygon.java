import java.util.LinkedList;
import java.util.List;

public class Polygon implements Figure{
    private double[] P1;
    private double[] P2;
    private double[] P3;
    private double[] P4;
    private double[] P5;

    private List<Point> points = new LinkedList<>();

   // public Polygon(double x1, double y1, double x2, double y2, double x3,double y3, double x4,double y4, double x5, double y5){
   public Polygon(Point p1, Point p2, Point p3, Point p4, Point p5){
       points.add(p1);
       points.add(p2);
       points.add(p3);
       points.add(p4);
       points.add(p5);

      //  P1 = new double[2];
      //  P2 = new double[2];
     //   P3 = new double[2];
      //  P4 = new double[2];
      //  P5 = new double[2];
        //P1[0] = x1;
       // P1[1] = y1;

        //P2[0] = x2;
        //P2[1] = y2;

        //P3[0] = x3;
       // P3[1] = y3;

       // P4[0] = x4;
       // P4[1] = y4;

       // P5[0] = x5;
       // P5[1] = y5;
    }

    public void move(double dx, double dy){
        Point tmp;
        for(int i = 0; i < points.size(); i++){
            tmp = points.get(i);
            tmp.move(dx, dy);
        }
    }

    @Override
    public void flip() {
        for(Point p:points){
            p.flip();
        }
    }

    public String toString(){
        //return("Line: [x1: "+this.P1[0]+", y1: "+this.P1[1]+", x2: "+this.P2[0]+", y2: "+this.P2[1]+"");
        StringBuilder stringBuilder = new StringBuilder("Polygon: [");
        for(Point p: points){
            stringBuilder.append(p.toString()+" | ");
        }
        stringBuilder.append("], \n ");
        return stringBuilder.toString();
    }
}
