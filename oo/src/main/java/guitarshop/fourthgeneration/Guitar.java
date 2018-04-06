package guitarshop.fourthgeneration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec guitarSpec;

    public Guitar(String serialNumber, double price,
                  Builder builder, String model,
                  Type type, Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = new GuitarSpec(builder, type, backWood, topWood, model);
    }
}
