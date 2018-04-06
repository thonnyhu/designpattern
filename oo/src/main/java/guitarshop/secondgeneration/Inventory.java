package guitarshop.secondgeneration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory() {
        guitars = new ArrayList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price,
                          Builder builder, String model,
                          Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator<Guitar> iterator = guitars.iterator(); iterator.hasNext(); ) {
            Guitar next = iterator.next();
            if (next.getSerialNumber().endsWith(serialNumber)) {
                return next;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar) {
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
            Guitar next = i.next();
            if (searchGuitar.getBuilder() != next.getBuilder())
                continue;
            String model = searchGuitar.getModel().toLowerCase();
            if (!model.equals("") && !model.equals(next.getModel().toLowerCase()))
                continue;
            if (searchGuitar.getType() != next.getType())
                continue;
            if (searchGuitar.getBackWood() != next.getBackWood())
                continue;
            if (searchGuitar.getTopWood() != next.getTopWood())
                continue;
        }
        return null;
    }
}
