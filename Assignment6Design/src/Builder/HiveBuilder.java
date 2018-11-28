package Builder;

import java.util.ArrayList;
import java.util.List;

import Decorator.Bee;

public interface HiveBuilder {
    public void setRoom(Room room);

}

class Hive implements HiveBuilder {
    Bee bee;
    private Room room;
    List<Room> roomList = new ArrayList<>();

    @Override
    public void setRoom(Room room) {
        // TODO Auto-generated method stub
        this.room = room;       //set the hive room
        roomList.add(this.room);  // add room to the list
    }

}
