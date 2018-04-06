package dogdoor.thirdgeneration;

import lombok.Data;

@Data
public class Bark {

    private String sound;

    public boolean equals(Object otherBark){
        if(otherBark instanceof Bark){
            Bark otherBark1 = (Bark) otherBark;
            if(this.sound.equalsIgnoreCase(otherBark1.getSound())){
                return true;
            }
        }
        return false;
    }
}
