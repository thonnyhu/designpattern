package factorymethod;

import abstractfactory.bombed.BombedWall;
import abstractfactory.bombed.RoomWithABomb;
import basic.Room;
import basic.Wall;

public class BombedMazeGame extends MazeGame{

    Wall makeWall(){
        return new BombedWall();
    }

    Room makeRoom(int n){
        return new RoomWithABomb(n);
    }
}
