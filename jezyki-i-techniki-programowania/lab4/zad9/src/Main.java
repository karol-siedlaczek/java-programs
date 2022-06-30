/*	Karol Siedlaczek I8X1N1 2019
	Zaimplementuj klasy Point, Line, Polygon, Group. 
	Przedostatnia klasa ma implementować wielokąty wyznaczone przez pewną liczbę punktów. 
	Ostatnia klasa ma implementować grupy figur (jak w przypadku edytorów typu PowerPoint). 
	Wszystkie klasy mają implementować interfejs Figure (lub klasę abstrakcyjną z abstrakcyjnymi metodami min. equals(Object o) żeby wymusić nadpisanie).  
	Zaimplementuj również klasę Group grupująca figury i również implementującą Figure. 
	Figure ma posiadać metody: •    move(double dx, double dy)  przesuwającą daną figurę •    flip() przerzucająca dana figurę •    equals(Object o) sprawdzającą, 
	czy figury są równe •    toString() zwracająca łańcuch znaków (String) reprezentujący daną figurę
*/
abstract class Main implements Figure{
    public static void main(String[] args) {
        Point p1_1 = new Point(1,1);
        Point p2_1 = new Point(1,2);
        Point p3_1 = new Point(2,2);
        Point p4_1 = new Point(2,1);
        Point p5_1 = new Point(2,1);
        Line line1 = new Line(15,30,48,22);
        Polygon polygon1 = new Polygon(p1_1,p2_1,p3_1,p4_1,p5_1);
        Group g1 = new Group(p1_1, p2_1, p3_1, p4_1, line1, polygon1);

        Point p1_2 = new Point(2,2);
        Point p2_2 = new Point(2,3);
        Point p3_2 = new Point(3,3);
        Point p4_2 = new Point(3,2);
        Line line2 = new Line(2,2,3,4);
        // Polygon polygon2 = new Polygon(2,3,4,5,6,7,8,9,0,22);
        Group g2 = new Group(p1_2, p2_2, p3_2, p4_2, line2, polygon1);

        Point p1_3 = new Point(5,5);
        Point p2_3 = new Point(6,4);
        Point p3_3 = new Point(5,5);
        Point p4_3 = new Point(5,2);
        Line line3 = new Line(5,5,10,15);
        // Polygon polygon3 = new Polygon(5,44,15,5,16,15,8,8,0,2);
        Group g3 = new Group(p1_3, p2_3, p3_3, p4_3, line3, polygon1);

        System.out.println(g1.toString());
        System.out.println(g2.toString());
        System.out.println(g3.toString());

        g1.move(1,1);
        g2.move(2,2);
        g3.move(3,3);

        System.out.println(g1.toString());
        System.out.println(g2.toString());
        System.out.println(g3.toString());

        g1.flip();
        g2.flip();
        g3.flip();

        System.out.println(g1.toString());
        System.out.println(g2.toString());
        System.out.println(g3.toString());

        System.out.println(g1.equals(g2));
        System.out.println(polygon1.equals(polygon1));
        System.out.println(g3.equals(g3));
    }
}
