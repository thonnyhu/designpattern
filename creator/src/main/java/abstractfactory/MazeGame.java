package abstractfactory;

import basic.*;

public class MazeGame {

    Maze createMaze(MazeFactory factory){
        Maze aMaze = factory.makeMaze();

        Room r1 = factory.makeRoom(1);
        Room r2 = factory.makeRoom(2);

        Door theDoor = factory.makeDoor(r1,r2);

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
