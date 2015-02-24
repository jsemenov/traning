package Vehicles;
public class Plane extends Vehicle{

    protected Plane(String typeVehicle, String surroundingsUse) {
        super(typeVehicle, surroundingsUse);
    }

    @Override
    void typeVehicle() {
        System.out.println("Im plane");
    }

    @Override
    public void can() {
        System.out.println("I can fly");
    }
}
