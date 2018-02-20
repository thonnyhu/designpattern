package basic;

import java.util.ArrayList;
import java.util.List;

public class Maze implements Cloneable{

    private List<Room>  rooms = new ArrayList<Room>();

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
