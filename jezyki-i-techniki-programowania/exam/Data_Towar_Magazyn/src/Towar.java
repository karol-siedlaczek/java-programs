public class Towar {
    String name;
    double price;
    Data data_waznosci;

    Towar(String name, double price, Data data_waznosci) {
        this.name = name;
        this.price = price;
        this.data_waznosci = data_waznosci;
    }

    Integer wazny(Data d) {
        int towarDni = this.data_waznosci.year * 360 + this.data_waznosci.month * 30 + this.data_waznosci.day;
        int dDni = d.year * 360 + d.month * 30 + d.day;
        int result = towarDni - dDni;
        if (result > 0)
            return result;
        else
            return -1;
    }
}
