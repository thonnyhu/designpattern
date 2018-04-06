package dogdoor.thirdgeneration;

import lombok.Data;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@Data
public class DogDoor {
    private boolean open;
    private List<Bark> allowedBark;

    public DogDoor(){
        this.open = true;
    }

    public void open(){
        System.out.println("The dog door opens.");
        open = true;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        },5000);
    }

    public void close(){
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen(){
        return open;
    }
}
