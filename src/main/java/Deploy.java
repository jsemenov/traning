import Animals.Cats;

public class Deploy {


    public static void main(String args[]) {


/*
      Cats cat1 = new Cats("Barsik", 10);
        Cats cat2 = new Cats("Valera", 2);

        Dogs dog1 = new Dogs("Chuk", 4);

        dog1.move();
        dog1.voice();
        dog1.bite();

        dog1.sleep();


        System.out.println(cat1.toString());
        cat1.voice();
        cat1.move();
        cat1.sleep();




        cat2.drinkMilk();
        cat2.move();
        System.out.println(cat2.toString());

        MountainBike bicycle = new MountainBike("im Bicycle"," type is Mountain Bike","the surroundings Use is land");
        System.out.println(bicycle.getTypeVehicle());
        System.out.println(bicycle.getSurroundingsUse());
                bicycle.can();
        bicycle.krutiPedaliPokaNeDali();
        */

        Cats catStrength = new Cats("Pudge", 5);

        catStrength.setHealth(1000);
        catStrength.setDamage(250);
        catStrength.setWeight(6);
        catStrength.setDefense(25);
        catStrength.setAgility(10);

      Cats catDodger = new Cats("Blood Seeker", 4);
        catDodger.setHealth(1000);
        catDodger.setDamage(170);
        catDodger.setWeight(3);
        catDodger.setDefense(15);
        catDodger.setAgility(50);

        catStrength.evidencePrint();
        catDodger.evidencePrint();

        //catDodger.fight(catStrength);
        catStrength.fight(catDodger);
       // System.out.println(catStrength.getSpeedFight());

    }
}
