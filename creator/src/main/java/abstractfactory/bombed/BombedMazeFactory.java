package abstractfactory.bombed;


import abstractfactory.MazeFactory;

public class BombedMazeFactory extends MazeFactory {

    public BombedWall makeWall(){
        return new BombedWall();
    }

    public RoomWithABomb makeRoom(int roomNumber){
        return new RoomWithABomb(roomNumber);
    }

}
