package Vehicles;
public class MountainBike extends Bicycle{

    String typeMountainBike;
    public MountainBike(String typeVehicle, String typeMountainBike, String surroundingsUse) {
        super(typeVehicle, surroundingsUse);
        this.typeMountainBike = typeMountainBike;
    }



    @Override
    public void krutiPedaliPokaNeDali() {
        System.out.println("Своего горного коня крути педали, пока люлей не надавали!");
    }

    @Override
    void typeVehicle() {
        System.out.println("Im cool Mountain Bicycle");
    }
}
