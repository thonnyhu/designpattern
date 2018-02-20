package basic;

import java.util.HashMap;
import java.util.Map;

public class Room implements MapSite,Cloneable{

    private Map<Direction,MapSite>  _sides = new HashMap<Direction, MapSite>();
    private int _roomNumber;

    public Room(int roomNo){
        this._roomNumber = roomNo;
    }

    public MapSite getSide(Direction direction){
        return _sides.get(direction);
    }

    public void setSide(Direction direction, MapSite mapSite){
        _sides.put(direction,mapSite);
    }

    public void enter() {

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

