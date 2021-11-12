package pl.patro.Figures;


import java.util.Objects;

public class Line implements Figure {

    private Point first;
    private Point second;
    private  double xyRatio;
    private  double movement;


       public void flip(){
        first.flip();
        second.flip();
        calculate();
    }

    public void move(double dx, double dy){
        first.move(dx, dy);
        second.move(dx, dy);
        calculate();
    }

    public Line(Point first, Point second) {
        this.first = first;
        this.second = second;
        calculate();
    }

    private void calculate(){
        double xRatio = first.getX()-second.getX();
        double yRatio = first.getY()-second.getY();
        xyRatio = yRatio/xRatio;
        if(Double.isInfinite(xyRatio)){
            movement = 0;
        } else {
            movement = first.getY() - xyRatio * first.getX();
        }
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Line){
            Line l = (Line)obj;
            return l.xyRatio == this.xyRatio && l.movement == this.movement;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Line: [ \n" + first.toString() + second.toString() +" ] \n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, xyRatio, movement);
    }
}
