package guitarshop2ed.thirdgeneration;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public  class Instrument {

    private String serialNumber;
    private double price;
    private InstrumentSpec instrumentSpec;

}
