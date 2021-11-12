package pl.patro.Figures;

public interface Figure {

    public boolean equals(Object obj);

    public void move(double dx, double dy);

    public void flip();

    public String toString();


}
