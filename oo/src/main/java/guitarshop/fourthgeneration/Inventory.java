package guitarshop.fourthgeneration;

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

    public List<Guitar>  search(GuitarSpec guitarSpec) {
        List<Guitar> list = new ArrayList<Guitar>();
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = i.next();
            GuitarSpec next = guitar.getGuitarSpec();
            if (guitarSpec.getBuilder() != next.getBuilder())
                continue;
            String model = guitarSpec.getModel().toLowerCase();
            if (!model.equals("") && !model.equals(next.getModel().toLowerCase()))
                continue;
            if (guitarSpec.getType() != next.getType())
                continue;
            if (guitarSpec.getBackWood() != next.getBackWood())
                continue;
            if (guitarSpec.getTopWood() != next.getTopWood())
                continue;
            list.add(guitar);
        }
        return list;
    }
}
