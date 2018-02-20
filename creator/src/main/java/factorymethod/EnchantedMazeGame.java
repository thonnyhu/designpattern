package factorymethod;

import abstractfactory.enchanted.EnchantedDoor;
import abstractfactory.enchanted.EnchantedRoom;
import basic.Door;
import basic.Room;

public class EnchantedMazeGame extends MazeGame{

    Room makeRoom (int n) {
        return new EnchantedRoom(n);
    }

    Door makeDoor (Room r1, Room r2){
        return new DoorNeedingSpell(r1,r2);
    }
}
