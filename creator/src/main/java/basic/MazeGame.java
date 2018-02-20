package basic;

public class MazeGame {
    public Maze createMaze(){
        Maze maze = new Maze();
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        maze.getRooms().add(r1);
        maze.getRooms().add(r2);

        Door theDoor = new Door(r1,r2);

        r1.setSide(Direction.NORTH,new Wall());
        r1.setSide(Direction.SOUTH,new Wall());
        r1.setSide(Direction.EAST,theDoor);
        r1.setSide(Direction.WEST,new Wall());

        r2.setSide(Direction.NORTH,new Wall());
        r2.setSide(Direction.SOUTH,new Wall());
        r2.setSide(Direction.EAST, new Wall());
        r2.setSide(Direction.WEST, theDoor);

        return maze;
    }
}
