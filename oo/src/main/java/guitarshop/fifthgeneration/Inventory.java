package guitarshop.fifthgeneration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory() {
        guitars = new ArrayList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
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

    public List<Guitar> search(GuitarSpec guitarSpec) {
        List<Guitar> list = new ArrayList<Guitar>();
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = i.next();
            GuitarSpec next = guitar.getGuitarSpec();
            if (next.match(guitarSpec)) {
                list.add(guitar);
            }
        }
        return list;
    }
}
