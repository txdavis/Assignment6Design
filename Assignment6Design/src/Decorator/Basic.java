package Decorator;

public class Basic extends BeeDecorator {
    public Basic(Bee decoratedBee) {
        super(decoratedBee);
        // this is the class that can add extra attributes to an already made bee
    }

    @Override
    public void create() {
        decoratedBee.create();
        addAttribute();
    } 
 
    private void addAttribute() {
        System.out.println("New Attribute added");  //testing to see how to add an attribute to a bee

    }

    @Override
    public int getAttack() {

        return decoratedBee.getAttack();
    } 

    @Override
    public int getPopulate() {

        return decoratedBee.getPopulate();
    }
    
    public int add(){
        return 3;  //testing random number
    }

    @Override
    public String getType() {
       
        return decoratedBee.getType();
    }

}
