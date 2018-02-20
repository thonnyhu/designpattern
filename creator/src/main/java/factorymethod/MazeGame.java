package factorymethod;


import basic.*;

public class MazeGame {

    Maze makeMaze(){
        return new Maze();
    }

    Room makeRoom(int n){
        return new Room(n);
    }

    Wall makeWall(){
        return new Wall();
    }

    Door makeDoor(Room r1 , Room r2){
        return new Door(r1,r2);
    }

    public Maze createMaze(){
        Maze aMaze = makeMaze();

        Room r1 = makeRoom(1);
        Room r2 = makeRoom(2);

        Door theDoor = makeDoor(r1,r2);

        aMaze.getRooms().add(r1);
        aMaze.getRooms().add(r2);

        r1.setSide(Direction.NORTH,new Wall());
        r1.setSide(Direction.SOUTH,new Wall());
        r1.setSide(Direction.EAST,theDoor);
        r1.setSide(Direction.WEST,new Wall());

        r2.setSide(Direction.NORTH,new Wall());
        r2.setSide(Direction.SOUTH,new Wall());
        r2.setSide(Direction.EAST, new Wall());
        r2.setSide(Direction.WEST, theDoor);

        return aMaze;
    }
}
