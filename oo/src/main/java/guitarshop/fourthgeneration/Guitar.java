package guitarshop.fourthgeneration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec guitarSpec;

}
