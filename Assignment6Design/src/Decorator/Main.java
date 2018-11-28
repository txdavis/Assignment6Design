package Decorator;

public class Main {
    public static void main(String[] args) {
        Bee bumble = new BumbleBee();
        Bee warrior = new WarriorBee();

        bumble.create();
        System.out.println();
        warrior.create();
 
        // System.out.println("\n" + bumble.getAttack());
        // System.out.println(warrior.getAttack());
        System.out.println("\nAdd new attribute to warrior:"); 
        Bee basic = new Basic(new WarriorBee());
        basic.create();
        System.out.println(((Basic) basic).add()); 
       
    } 
}
