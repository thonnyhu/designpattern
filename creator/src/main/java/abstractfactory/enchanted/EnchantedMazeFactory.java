package abstractfactory.enchanted;


import abstractfactory.MazeFactory;
import basic.Door;
import basic.Room;

public class EnchantedMazeFactory extends MazeFactory {

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return new EnchantedDoor(r1,r2);
    }
}
