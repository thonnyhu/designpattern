package dogdoor.thirdgeneration;

import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {

    private DogDoor door;

    public BarkRecognizer(DogDoor door){
        this.door = door;
    }

    public void recognize(Bark bark){
        List<Bark> allowedBark = door.getAllowedBark();
        for(Iterator i = allowedBark.iterator();i.hasNext();){
            if(i.next().equals(bark)){
                door.open();
                return;
            }
        }
    }
}
