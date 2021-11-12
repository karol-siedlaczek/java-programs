package lab6;

public class Point implements Figure{​​​​
    private double x, y;
    public Point(double nx, double ny) {​​​​
        x = nx ;
        y = ny ;
    }​​​​
    public Point(Point P) {​​​​
        x = P.getX();
        y = P.getY();
    }​​​​
    public double getX() {​​​​
        return this.x;
    }​​​​
    public double getY() {​​​​
        return this.y;
    }​​​​
    public Point clone() {​​​​
        return new Point(this.getX(), this.getY());
    }​​​​
    public void move (double dx, double dy) {​​​​
        this.x += dx;
        this.y += dy;
    }​​​​
    public void flip () {​​​​
        this.x = -this.x;
        this.y = -this.y;
    }​​​​
    public boolean equals(Object o) {​​​​
        if(o.getClass() != this.getClass())
            return false;
        Point P = (Point) o;
        if(P.getX() == this.x && P.getY() == this.y)
            return true;
        else
            return false;
    }​​​​
    public String toString () {​​​​
        String point = "(" + String.valueOf(this.getX()) + "," + String.valueOf(this.getY()) + ")";
        return point;
    }​​​​
}​​​​