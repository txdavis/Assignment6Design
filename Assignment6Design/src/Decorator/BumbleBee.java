package Decorator;

public class BumbleBee implements Bee {

    @Override
    public void create() {
        int attack = 1;  //set initial attack value for bee
        int populate = 5; //set initial population rate value for bee
        System.out.println("BumbleBee stats\nAttack: " + attack + "," + "Populate: " + populate);
    }

    @Override
    public int getAttack() { 

        return 1;
    } 

    @Override
    public int getPopulate() {

        return 5;
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return "Bumble Bee";
    }

}