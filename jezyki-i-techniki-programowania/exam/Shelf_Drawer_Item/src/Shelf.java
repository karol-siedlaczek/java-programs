import java.util.ArrayList;

public class Shelf {
    ArrayList<Drawer> drawers = new ArrayList<>();

    void add(Drawer drawer){
        drawers.add(drawer);
    }

    ArrayList<Drawer> toBeLocked(double val) throws IllegalArgumentException{
        if (val <= 0)
            throw new IllegalArgumentException("val cannot be equal or less than zero");
        ArrayList<Drawer> drawersToLocked = new ArrayList<>();
        double itemsValueSum;
        for (Drawer drawer : this.drawers) {
            itemsValueSum = 0;
            for (Item item : drawer.items) {
                itemsValueSum += item.value;
            }
            if (itemsValueSum >= val) {
                drawersToLocked.add(drawer);
            }
        }
        return drawersToLocked;
    }
}















