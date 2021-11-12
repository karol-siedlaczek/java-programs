/* 	Karol Siedlaczek I8X1N1 2019
	1. Zaimplementuj komponent rysujący flagę polski, a następnie polską szachownicę. Dodaj na spodzie napis Polska.
*/
import pl.Figures.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// TESTS
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,2);
        Point p3= new Point(2,2);
        Point p4= new Point(2,1);
        Line line = new Line(new Point(1,1), new Point(1,2));
        Polygon polygon = new Polygon(new Point(1,1), new Point(1,2),new Point(2,2), new Point(2,1));

        Point p11 = new Point(1,1);
        Point p21 = new Point(1,2);
        Point p31= new Point(2,2);
        Point p41= new Point(2,1);
        Line line1 = new Line(new Point(1,1), new Point(1,2));
        Polygon polygon1 = new Polygon(new Point(1,1), new Point(1,2),new Point(2,2), new Point(2,1));

        Group g = new Group(p1,p2,p3,p4,line,polygon);
        Group g1 = new Group(p11,p21,p31,p41,line1,polygon1);



        System.out.println(g.toString());

        g.move(1,1);
        g1.move(1,1);

        System.out.println(g.toString());

        g.flip();
        g1.flip();

        System.out.println(g.toString());

        System.out.println( g.equals(g1));

    }
}
