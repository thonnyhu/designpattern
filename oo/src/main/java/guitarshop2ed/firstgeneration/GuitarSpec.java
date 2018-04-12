package guitarshop2ed.firstgeneration;

import lombok.Data;

@Data
public class GuitarSpec extends InstrumentSpec {
    private int numberStrings;


    public GuitarSpec(Builder builder, Type type, Wood backWood, Wood topWood, String model, int numberStrings) {
        super(builder, type, backWood, topWood, model);
        this.numberStrings = numberStrings;
    }

    @Override
    public boolean match(InstrumentSpec otherInstrumentSpec) {
        if (!super.match(otherInstrumentSpec)) {
            return false;
        }
        if (!(otherInstrumentSpec instanceof GuitarSpec)) {
            return false;
        }
        GuitarSpec spec = (GuitarSpec) otherInstrumentSpec;
        if (spec.getNumberStrings() != numberStrings) {
            return false;
        }
        return true;
    }
}
