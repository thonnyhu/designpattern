package guitarshop2ed.firstgeneration;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Instrument {

    private String serialNumber;
    private double price;
    private InstrumentSpec instrumentSpec;

}
