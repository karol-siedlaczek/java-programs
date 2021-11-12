package pl.patro.Figures;

import java.util.Objects;

public class Point implements Figure{

    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void move(double dx, double dy) {
        x+=dx;
        y+=dy;
    }

    @Override
    public void flip() {
        x=-x;
        y=-y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point){
            Point p = (Point)obj;
            if(p.x == this.x && p.y == this.y){
                return true;
            } else {
                return false;
            }
        } else return false;
    }

    @Override
    public String toString() {
        return "Point: [ x=" + x + ", y=" + y + " ], \n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
