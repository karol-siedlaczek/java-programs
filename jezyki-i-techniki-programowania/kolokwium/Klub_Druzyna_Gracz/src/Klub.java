import java.util.ArrayList;

public class Klub {
    ArrayList<Druzyna> druzyny = new ArrayList<>();

    void add(Druzyna druzyna) {
        druzyny.add(druzyna);
    }

    ArrayList<Gracz> wyzsi(int above) {
        if (above < 120 || above > 240)
            throw new IllegalArgumentException("value need to be in range 120 - 240");
        ArrayList<Gracz> wyzsiGracze = new ArrayList<>();
        for (Druzyna druzyna : this.druzyny) {
            for (Gracz gracz : druzyna.gracze) {
                if (gracz.wzrost >= above) {
                    wyzsiGracze.add(gracz);
                }
            }
        }
        return wyzsiGracze;
    }
}
