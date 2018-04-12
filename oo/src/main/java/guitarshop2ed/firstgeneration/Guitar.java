package guitarshop2ed.firstgeneration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Guitar extends Instrument {

    public Guitar(String serialNumber, double price , GuitarSpec guitarSpec) {
        super(serialNumber, price, guitarSpec);
    }
}
