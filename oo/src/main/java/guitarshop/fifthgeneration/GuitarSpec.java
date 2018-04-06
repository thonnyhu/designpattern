package guitarshop.fifthgeneration;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GuitarSpec {
    private Builder builder;
    private Type type;
    private Wood backWood, topWood;
    private String model;
    private int numberStrings;

    public boolean match(GuitarSpec otherSpec){
        if(builder != otherSpec.getBuilder()){
            return false;
        }
        if((model != null ) && (!model.equals("")) && !model.equals(otherSpec.getModel())){
            return false;
        }
        if(type != otherSpec.getType()){
            return false;
        }
        if(backWood != otherSpec.getBackWood()){
            return false;
        }
        if(topWood != otherSpec.getTopWood()){
            return false;
        }
        return true;
    }
}
