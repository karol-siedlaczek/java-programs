import java.util.ArrayList;

public class Carriage {
    ArrayList<Seat> seats = new ArrayList<>();

    void add(Seat seat) {
        seats.add(seat);
    }

    static boolean odd(int x) {
        if (x % 2 != 0) // odd
            return true;
        else // even
            return false;
    }
}
