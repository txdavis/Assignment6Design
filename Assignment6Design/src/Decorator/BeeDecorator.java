package Decorator;

public abstract class BeeDecorator implements Bee {
    protected Bee decoratedBee;

    public BeeDecorator(Bee decoratedBee) { 
        this.decoratedBee = decoratedBee;
    }
 
    public void create() {
        decoratedBee.create(); 
    }

    public int getAtttack() {
        return decoratedBee.getAttack();
    }

    public int getPopulate() {
        return decoratedBee.getPopulate();
    }
}
