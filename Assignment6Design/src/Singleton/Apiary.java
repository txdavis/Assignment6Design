package Singleton;



public class Apiary {
    //BeeHive hives = new BeeHive();
    public  String s;
    private Apiary() { 
       s =  "New Beehive created"; 
    }

    private static Apiary apInstance = null;  // create a nuul apiary to allow one instance

    public static Apiary getInstance() {
        if (apInstance == null) {       // if the initial apiary is null, then we create one, and therefore
            apInstance = new Apiary();  // any attempt to create an additional one, will be denied.
        }
        return apInstance; 
    }
}
