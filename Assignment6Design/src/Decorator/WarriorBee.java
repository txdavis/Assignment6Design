package Decorator;

public class WarriorBee implements Bee {
 
    @Override
    public  void create() {
        int attack = 5; //set initial attack value
        int populate = 1;//set initial population rate value
        System.out.println("Warrior Bee stats\nAttack: " + attack + "," + "Populate: " + populate);
    }
 
    @Override
    public int getAttack() {

        return 5;
    }

    @Override
    public int getPopulate() {
        // TODO Auto-generated method stub 
        return 1;
    }

    @Override
    public String getType() { 
        // TODO Auto-generated method stub
        return "Warrior Bee";
    }

}
