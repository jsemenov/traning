package Vehicles;
public abstract class Vehicle implements Iabstract{

    private String typeVehicle;

    private String surroundingsUse;

    protected Vehicle(String typeVehicle, String surroundingsUse) {
        this.typeVehicle = typeVehicle;
        this.surroundingsUse = surroundingsUse;
    }

    abstract void typeVehicle();



    public String getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    public String getSurroundingsUse() {
        return surroundingsUse;
    }

    public void setSurroundingsUse(String surroundingsUse) {
        this.surroundingsUse = surroundingsUse;
    }

}
