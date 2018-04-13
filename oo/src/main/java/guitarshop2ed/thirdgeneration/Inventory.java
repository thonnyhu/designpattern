package guitarshop2ed.thirdgeneration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

    private List<Instrument> instruments;

    public Inventory() {
        instruments = new ArrayList<Instrument>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
        Instrument instrument = new Instrument(serialNumber, price, instrumentSpec);
        instruments.add(instrument);

    }

    public Instrument getInstrument(String serialNumber) {
        for (Iterator<Instrument> iterator = instruments.iterator(); iterator.hasNext(); ) {
            Instrument next = iterator.next();
            if (next.getSerialNumber().endsWith(serialNumber)) {
                return next;
            }
        }
        return null;
    }

    public List<Instrument> search(InstrumentSpec otherSpec) {
        List<Instrument> list = new ArrayList<Instrument>();
        for (Iterator<Instrument> i = instruments.iterator(); i.hasNext(); ) {
            Instrument instrument = i.next();
            if(instrument.getInstrumentSpec().match(otherSpec)){
                list.add(instrument);
            }
        }
        return list;
    }

}
