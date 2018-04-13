package guitarshop2ed.secondgeneration;

import lombok.Getter;

@Getter
public class Guitar extends Instrument {

    public Guitar(String serialNumber, double price , GuitarSpec guitarSpec) {
        super(serialNumber, price, guitarSpec);
    }
}
