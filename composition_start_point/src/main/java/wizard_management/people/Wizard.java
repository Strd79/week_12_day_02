package wizard_management.people;


import wizard_management.behaviours.IFly;
import wizard_management.cleaning.Broomstick;

public class Wizard {
    private String name;
    private IFly ride;

    public Wizard(String name, IFly ride){
        this.name = name;
        this.ride = ride;
    }

    public String getName(){
        return this.name;
    }

    public IFly getRide(){
        return this.ride;
    }

    public String fly(){
        return this.ride.fly();
    }

    public void setRide(IFly ride) {
        this.ride = ride;
    }

}
