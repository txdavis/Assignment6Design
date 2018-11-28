package all;

import Builder.Build;
import Builder.WHive;
import Builder.WBHiveBuilder;
import Decorator.Basic;
import Decorator.Bee;
import Decorator.BumbleBee;
import Decorator.WarriorBee;
import Singleton.Apiary;

public class Main {

    public static void main(String[] args) {

        System.out.println("Testing the decorator design:");
        System.out.println("-----------------------------"); 
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

        /*
         * Bee warrior = new WarriorBee(); Bee bumble = new BumbleBee();
         * warrior.create(); bumble.create(); Room room = new Room(bumble);
         * BeeHive hive = new BeeHive(); System.out.println(room.getBee());
         * room.setSpawn(warrior); System.out.println(room.getBee()); Bee b =
         * room.getBee(); System.out.println(b);
         * 
         * System.out.println(b.getAttack()); // hive.setRoom(room);
         * System.out.println(hive.setRoom(room));
         * System.out.println(hive.getRoom());
         */
        // Bee bumble = new BumbleBee();
        // bumble.create();
        // Room room = new Room(bumble);
        /*
         * for (int i = 0; i < 5; i++) { Bee bum = new BumbleBee();
         * bum.create(); room.setSpawn(bum); }
         * 
         * System.out.println(room.beeList.get(0).getAttack()); room.getList();
         * // room.length(); room.beeList.get(0).getAttack();
         */
        System.out.println("\n\nTesting the builder design:");
        System.out.println("-----------------------------");
        WBHiveBuilder war = new WHive();
        Build b = new Build(war);
        b.construct();
        // System.out.println(b.getHive());

        b.getHive();

        System.out.println("\n\nTesting the singleton design:");
        System.out.println("-----------------------------");
        Apiary a = Apiary.getInstance();
        Apiary c = Apiary.getInstance();

        if (a == c) { // Shows only one instance is made
            System.out.println(a.s);
        }

    }
}
