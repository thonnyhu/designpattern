package abstractfactory;


import basic.Door;
import basic.Maze;
import basic.Room;
import basic.Wall;

public class MazeFactory  {

    public Maze makeMaze(){
        return new Maze();
    }

    public Wall makeWall(){
        return new Wall();
    }

    public Room makeRoom(int roomNumber){
        return new Room(roomNumber);
    }

    public Door makeDoor(Room r1, Room r2){
        return new Door(r1,r2);
    }
}
