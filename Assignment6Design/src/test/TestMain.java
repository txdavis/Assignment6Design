package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import Builder.Build;
import Builder.Room;
import Builder.BHive;
import Builder.WHive;
import Builder.WBHiveBuilder;
import Decorator.Basic;
import Decorator.Bee;
import Decorator.BumbleBee;
import Decorator.WarriorBee;
import Singleton.Apiary;

public class TestMain {

    @Test
    public void beetest() {
        Bee bumble = new BumbleBee();
        Bee warrior = new WarriorBee();
        bumble.create();
        warrior.create();
        assertTrue(bumble.getAttack() == 1);
        assertTrue(warrior.getAttack() == 5);
        assertTrue(bumble.getPopulate() == 5);
        assertTrue(warrior.getPopulate() == 1);
        assertTrue(warrior.getType().equals("Warrior Bee"));
        assertTrue(bumble.getType().equals("Bumble Bee"));
        Bee basic = new Basic(new WarriorBee()); 
        basic.create();
        ((Basic) basic).add();
        assertTrue(basic.getAttack() == 5);
        assertTrue(basic.getPopulate() == 1);
        assertTrue(basic.getType().equals("Warrior Bee"));
    }

    @Test
    public void apiarytest() {
        Apiary a = Apiary.getInstance();
        Apiary b = Apiary.getInstance();
        assertTrue(a == b);
    }

    @Test
    public void hivetest() {
        WBHiveBuilder war = new WHive();
        WBHiveBuilder bum = new BHive();
        Build c = new Build(bum);
        Build b = new Build(war);
        b.construct();
        c.construct();
        b.getHive();
        c.getHive();
        assertTrue(c != b);
    }

    @Test
    public void roomtest() {
        Bee warrior = new WarriorBee();
        Bee bumble = new BumbleBee();
        warrior.create();
        bumble.create();
        Room room = new Room(bumble);       
        assertTrue(room.getBee() == bumble);
        room.setSpawn(warrior);
        assertTrue(room.getBee() == warrior);
        assertTrue(room.length() == 2); 
        
        
    }
}
