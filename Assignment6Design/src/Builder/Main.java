package Builder;

import Decorator.Bee;
import Decorator.BumbleBee;
import Decorator.WarriorBee;

public class Main {

    public static void main(String[] args) {
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
        WBHiveBuilder war = new WHive();
        Build b = new Build(war);
        b.construct();
        // System.out.println(b.getHive());

        b.getHive();

    }

}
