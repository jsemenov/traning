package Animals;

/**
 * Created by user on 2/9/15.
 */
public abstract class Animals implements IAnimalAction{


    String name;
    Integer age;


    @Override
    public void voice() {

        System.out.println( " i don't know who am I");

    }

    @Override
    public void move() {

        System.out.println("do some move");

    }

    @Override
    public void sleep() {

        System.out.println("some animal sleep");

    }
}
