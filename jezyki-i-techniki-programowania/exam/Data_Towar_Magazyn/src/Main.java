public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(2020, 12,1);
        Data data2 = new Data(2019, 12,1);
        Data data3 = new Data(2020, 4,24);
        Towar towar1 = new Towar("nazwa1", 50, data1);
        Towar towar2 = new Towar("nazwa2", 100, data2);
        Towar towar3 = new Towar("nazwa3", 150, data1);
        Towar towar4 = new Towar("nazwa4", 200, data2);

        Magazyn magazyn1 = new Magazyn();
        System.out.println(towar1.wazny(data3));
        System.out.println(towar2.wazny(data3));
        System.out.println(towar3.wazny(data3));
        System.out.println(towar4.wazny(data3));
        magazyn1.add(towar1);
        magazyn1.add(towar2);
        magazyn1.add(towar3);
        magazyn1.add(towar4);

        for (Towar towar : magazyn1.przeterminowane(data3)) {
            System.out.println(towar.name);
        }
    }
}
