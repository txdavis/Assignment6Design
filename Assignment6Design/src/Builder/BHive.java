package Builder;

import java.util.ArrayList;
import java.util.List;

import Decorator.Bee;
import Decorator.BumbleBee;




public class BHive implements  WBHiveBuilder {
    private Hive hive;
    Bee bee;
    private Room room;
    List<Room> roomList = new ArrayList<>(); 
    
    
    public BHive(){
        this.hive = new Hive();  //creates a new hive
    }


    @Override 
    public void makeRoom() {
        
        this.room = new Room(new BumbleBee()); //creates a new room that has a bumble bee in it
        roomList.add(this.room);        // adds the room to the list
    } 
    @Override
    public Hive getHive(){
        return this.hive;       
    }
    @Override
    public void getList(){
        for(int i = 0; i < roomList.size(); i++){
            System.out.println(roomList.get(i));
        }
    }
}
