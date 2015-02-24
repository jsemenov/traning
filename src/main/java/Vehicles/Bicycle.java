package Vehicles;
public abstract class Bicycle extends Vehicle implements Ibicycle {


    public Bicycle(String typeVehicle, String surroundingsUse) {
        super(typeVehicle, surroundingsUse);
    }


    @Override
    void typeVehicle() {
        System.out.println("Im Bicycle");
    }

    @Override
    public void can() {
        System.out.println("human can ride it");
    }


}
