package Builder;

import java.util.ArrayList;
import java.util.List;

import Decorator.Bee;


public class Room {
    List<Bee> beeList = new ArrayList<>(); 
    private Bee bee;
    
    public Room(){
        
     }
    
    public Room(Bee bee){
       this.bee=bee;    // create bee
       beeList.add(this.bee);  // add to list
    }
    
    public void setSpawn(Bee bee){
        this.bee=bee;       // create bee 
        beeList.add(this.bee);// add to list
    }
    
    public Bee getBee(){
        return this.bee;                    
    }
    
    public void getList(){
        for(int i = 0; i < beeList.size(); i++){
            System.out.println(beeList.get(i));  //returns the bees in the list   
        }
    }
    
    public int length(){ 
        return beeList.size();
    }
}
