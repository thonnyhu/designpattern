package guitarshop.fourthgeneration;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GuitarSpec {
    private Builder builder;
    private Type type;
    private Wood backWood, topWood;
    private String model;
}
