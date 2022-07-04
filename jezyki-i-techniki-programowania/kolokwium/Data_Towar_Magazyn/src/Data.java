public class Data {
    int year;
    int month;
    int day;

    Data (int year, int month, int day) {
        if (year < 0)
            throw new IllegalArgumentException("year need to be greater than zero");
        else
            this.year = year;
        if (month > 12)
            throw new IllegalArgumentException("month cannot be greater than 12");
        else
            this.month = month;
        if (day > 30)
            throw new IllegalArgumentException("day cannot be greater than 30");
        else
            this.day = day;
    }
}
