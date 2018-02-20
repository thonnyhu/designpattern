package prototype;

import abstractfactory.MazeFactory;
import basic.Door;
import basic.Maze;
import basic.Room;
import basic.Wall;

public class MazePrototypeFactory extends MazeFactory{
    private Maze _prototypeMaze;
    private Room _prototypeRoom;
    private Door _prototypeDoor;
    private Wall _prototypeWall;


    public MazePrototypeFactory(Maze _prototypeMaze, Room _prototypeRoom, Door _prototypeDoor, Wall _prototypeWall) {
        this._prototypeMaze = _prototypeMaze;
        this._prototypeRoom = _prototypeRoom;
        this._prototypeDoor = _prototypeDoor;
        this._prototypeWall = _prototypeWall;
    }

    @Override
    public Maze makeMaze() {
        try {
            return (Maze) _prototypeMaze.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Wall makeWall() {
        try {
            return (Wall) _prototypeWall.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Room makeRoom(int roomNumber) {
        try {
            return (Room) _prototypeRoom.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        try {
            return (Door) _prototypeDoor.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
