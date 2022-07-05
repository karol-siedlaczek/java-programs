import java.util.ArrayList;

public class Train {
    ArrayList<Carriage> carriages = new ArrayList<>();

    public boolean contains(ArrayList<Carriage> carriages) {
        for (Carriage carriage : carriages)
            return true;
        return false;
    }

    void add(Carriage carriage) {
        carriages.add(carriage);
    }

    ArrayList<Seat> freeDouble() throws VerifyError {
        if (!this.contains(this.carriages))
            throw new VerifyError("no carriages");
        ArrayList<Seat> freeDoubleSeats = new ArrayList<>();
        Seat BeforeFreeOddSeat = null;
        for (Carriage carriage : this.carriages) {
            for (Seat seat : carriage.seats) {
                if (BeforeFreeOddSeat == null && Carriage.odd(seat.number) && !seat.occupied) {
                    BeforeFreeOddSeat = seat;
                }
                else if (BeforeFreeOddSeat != null && !Carriage.odd(seat.number) && !seat.occupied) {
                    freeDoubleSeats.add(BeforeFreeOddSeat);
                    BeforeFreeOddSeat = null;
                }
                else {
                    BeforeFreeOddSeat = null;
                }
            }
        }
        return freeDoubleSeats;
    }
}
