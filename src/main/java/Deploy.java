import Animals.Animals;
import Animals.Cats;
import Animals.Dogs;

public class Deploy {


    public static void main(String args[]) {


        Animals someAnimal = new Cats("AnimalCat", 13);
        Animals animals = new Dogs(" dogClass", 4);


        System.out.println(animals.getClass());

        System.out.println();


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




    }
}
