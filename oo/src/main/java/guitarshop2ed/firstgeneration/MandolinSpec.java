package guitarshop2ed.firstgeneration;

import lombok.Data;

@Data
public class MandolinSpec extends InstrumentSpec {

    private Style style;

    public MandolinSpec(Builder builder, Type type, Wood backWood, Wood topWood, String model, Style style) {
        super(builder, type, backWood, topWood, model);
        this.style = style;
    }

    @Override
    public boolean match(InstrumentSpec otherInstrumentSpec) {
        if (!super.match(otherInstrumentSpec)) {
            return false;
        }
        if (!(otherInstrumentSpec instanceof MandolinSpec)) {
            return false;
        }
        MandolinSpec spec = (MandolinSpec) otherInstrumentSpec;
        if (spec.getStyle() != style) {
            return false;
        }
        return true;
    }
}
