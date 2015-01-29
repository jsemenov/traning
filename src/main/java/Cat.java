/**
 * Created by user on 1/29/15.
 */
public class Cat extends NewAnimal implements IAnimalAction {



    public void murl(){

        System.out.println("Mrrrrrrrr");
    }


    @Override
    public boolean eat() {
        return false;
    }

    @Override
    public boolean sleep() {
        return false;
    }

    @Override
    public void doShit() {

    }

    public void voice(){

        System.out.println("Mya!!!");

    }



}
