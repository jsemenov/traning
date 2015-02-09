import Animals.Cats;
import Animals.Dogs;

public class Deploy {


    public static void main(String args[]) {


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
