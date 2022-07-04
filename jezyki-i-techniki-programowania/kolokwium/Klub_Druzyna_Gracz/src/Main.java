public class Main {
    public static void main(String[] args) {
        Gracz gracz1 = new Gracz(190);
        Gracz gracz2 = new Gracz(150);
        Gracz gracz3 = new Gracz(170);
        Gracz gracz4 = new Gracz(185);

        Gracz gracz5 = new Gracz(120);
        Gracz gracz6 = new Gracz(160);
        Gracz gracz7 = new Gracz(134);
        Gracz gracz8 = new Gracz(220);

        Druzyna druzyna1 = new Druzyna();
        Druzyna druzyna2 = new Druzyna();

        druzyna1.add(gracz1);
        druzyna1.add(gracz2);
        druzyna1.add(gracz3);
        druzyna1.add(gracz4);

        druzyna2.add(gracz5);
        druzyna2.add(gracz6);
        druzyna2.add(gracz7);
        druzyna2.add(gracz8);

        Klub klub = new Klub();
        klub.add(druzyna1);
        klub.add(druzyna2);

        for (Gracz gracz : klub.wyzsi(180)) {
            System.out.println(gracz.wzrost);
        }
    }
}
