package guitarshop.secondgeneration;

import lombok.Getter;

@Getter
public class Guitar {
    private String serialNumber, model;
    private Builder builder;
    private Type type;
    private Wood backWood, topWood;
    private double price;

    public Guitar(String serialNumber, double price,
                  Builder builder, String model,
                  Type type, Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }


}
