package guitarshop.firstgeneration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory(){
        guitars = new ArrayList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price,
                          String builder, String model,
                          String type, String backWood, String topWood){
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar (String serialNumber){
        for(Iterator<Guitar> iterator = guitars.iterator(); iterator.hasNext();){
            Guitar next = iterator.next();
            if(next.getSerialNumber().endsWith(serialNumber)){
                return next;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar){
        for (Iterator<Guitar> i = guitars.iterator();i.hasNext();){
            Guitar next = i.next();
            String builder = searchGuitar.getBuilder();
            if(builder !=null && !builder.equals("") && !builder.equals(next.getBuilder()))
                continue;
            String model = searchGuitar.getModel();
            if(model !=null && !model.equals("") && !model.equals(next.getModel()))
                continue;
            String type = searchGuitar.getType();
            if(type !=null && !type.equals("") && !type.equals(next.getType()))
                continue;
            String backWood = searchGuitar.getBackWood();
            if(backWood !=null && !backWood.equals("") && !backWood.equals(next.getBackWood()))
                continue;
            String topWood = searchGuitar.getTopWood();
            if(topWood !=null && !topWood.equals("") && !topWood.equals(next.getTopWood()))
                continue;
        }
        return null;
    }
}
