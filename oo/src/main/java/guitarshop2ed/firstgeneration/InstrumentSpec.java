package guitarshop2ed.firstgeneration;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class InstrumentSpec {
    private Builder builder;
    private Type type;
    private Wood backWood, topWood;
    private String model;

    public  boolean match(InstrumentSpec otherInstrumentSpec){
        if(this.getBuilder() != otherInstrumentSpec.getBuilder()){
            return false;
        }
        if((getModel() != null ) && (!getModel().equals("")) && !getModel().equals(otherInstrumentSpec.getModel())){
            return false;
        }
        if(getType() != otherInstrumentSpec.getType()){
            return false;
        }
        if(getBackWood() != otherInstrumentSpec.getBackWood()){
            return false;
        }
        if(getTopWood() != otherInstrumentSpec.getTopWood()){
            return false;
        }
        return true;
    }
}
