package Vehicles;
public class StreetBike extends Bicycle {

    String typeStreetBike;
    public StreetBike(String typeVehicle, String typeStreetBike, String surroundingsUse) {
        super(typeVehicle, surroundingsUse);
        this.typeStreetBike = typeStreetBike;
    }

    @Override
    public void krutiPedaliPokaNeDali() {
        System.out.println("Своего спортвелика крути педали, пока люлей не вписали!");
    }
    @Override
    void typeVehicle() {
        System.out.println("Im sport street Bicycle with thin wheels");
    }
}
