package lab6;
public class Line implements Figure{​​​​
    private Point p1, p2;
    public Line(Point A, Point B){​​​​
        p1 = A;
        p2 = B;
    }​​​​
    public Line(Line L){​​​​
        p1 = L.getP1();
        p2 = L.getP2();
    }​​​​
    public Point getP1() {​​​​
        return this.p1;
    }​​​​
    public Point getP2() {​​​​
        return this.p2;
    }​​​​
    public void move(double dx, double dy) {​​​​
        p1.move(dx, dy);
        p2.move(dx, dy);
    }​​​​
    public void flip() {​​​​
        p1.flip();
        p2.flip();
    }​​​​
    public boolean equals(Object o) {​​​​
        if(o.getClass() != this.getClass())
            return false;
        Line L = (Line) o;
        if((this.getP1().equals(L.getP1()) && this.getP2().equals(L.getP2())) ||
                (this.getP1().equals(L.getP2()) && this.getP2().equals(L.getP1())))
            return true;
        else
            return false;
    }​​​​
    public String toString() {​​​​
        String line = "A:" + (this.getP1()).toString() + "B:" + (this.getP2()).toString();
        return line;
    }​​​​
}​​​​