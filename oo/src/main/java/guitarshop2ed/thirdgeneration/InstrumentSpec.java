package guitarshop2ed.thirdgeneration;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Iterator;
import java.util.Map;

@Data
@AllArgsConstructor
public class InstrumentSpec {
    private Map<String, Object> properties;

    public boolean match(InstrumentSpec otherInstrumentSpec){
        for(Iterator<String> i = otherInstrumentSpec.getProperties().keySet().iterator();i.hasNext();){
            String propertyName = i.next();
            if (!properties.get(propertyName).equals(otherInstrumentSpec.getProperties().get(propertyName))){
                return false;
            }
        }
        return true;
    }
}
