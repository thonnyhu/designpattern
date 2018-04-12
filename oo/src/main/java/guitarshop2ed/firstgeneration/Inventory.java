package guitarshop2ed.firstgeneration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

    private List<Instrument> instruments;

    public Inventory() {
        instruments = new ArrayList<Instrument>();
    }

    public void addGuitar(String serialNumber, double price, InstrumentSpec instrumentSpec) {
        Instrument instrument ;
        if(instrumentSpec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec)instrumentSpec);
            instruments.add(instrument);
        }else if(instrumentSpec instanceof MandolinSpec){
            instrument = new Mandolin(serialNumber,price, (MandolinSpec)instrumentSpec);
            instruments.add(instrument);
        }

    }

    public Instrument getGuitar(String serialNumber) {
        for (Iterator<Instrument> iterator = instruments.iterator(); iterator.hasNext(); ) {
            Instrument next = iterator.next();
            if (next.getSerialNumber().endsWith(serialNumber)) {
                return next;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec guitarSpec) {
        List<Guitar> list = new ArrayList<Guitar>();
        for (Iterator<Instrument> i = instruments.iterator(); i.hasNext(); ) {
            Instrument instrument = i.next();
            if(instrument instanceof Guitar) {
                GuitarSpec next = (GuitarSpec) instrument.getInstrumentSpec();
                if (next.match(guitarSpec)) {
                    list.add((Guitar)instrument);
                }
            }
        }
        return list;
    }

    public List<Mandolin> search(MandolinSpec mandolinSpec) {
        List<Mandolin> list = new ArrayList<Mandolin>();
        for (Iterator<Instrument> i = instruments.iterator(); i.hasNext(); ) {
            Instrument instrument = i.next();
            if(instrument instanceof Mandolin) {
                MandolinSpec next = (MandolinSpec) instrument.getInstrumentSpec();
                if (next.match(mandolinSpec)) {
                    list.add((Mandolin) instrument);
                }
            }
        }
        return list;
    }
}
