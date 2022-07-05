import java.util.ArrayList;

public class FootballTeam {
    String name;
    ArrayList<Play> plays = new ArrayList<>();

    FootballTeam(String name) {
        this.name = name;
    }

    void add(Play play){
        plays.add(play);
    }

    int wins() {
        int wygrane = 0;
        for (Play play : this.plays) {
            if (play.result_team_1 > play.result_team_2)
                wygrane++;
        }
        return wygrane;
    }
}
