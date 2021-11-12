import java.util.Objects;

public class Point implements Figure{
    private double x;
    private double y;

    public Point(double x, double y){//CLASS POINT
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(double dx, double dy){//LINE
        x += dx;
        y += dy;
    }

    @Override
    public void flip(){
        /*double a;
        a = y;
        y = -x;
        x = -a;*/
        x *= -1;
        y *= -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public String toString(){
        return ("x1: " + this.x + ", y1: " + this.y);
    }
}