package basic;

public class Door implements MapSite,Cloneable{

    private Room room1,room2;

    private boolean isOpen;

    public Room otherSideFrom(Room room){
        return room == room1? room1: room2;
    }

    public void enter() {

    }


    public Door(Room r1, Room r2){
        this.room1 = r1;
        this.room2 = r2;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
