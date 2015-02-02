
public class Shark extends NewAnimal implements IAnimalAction {


    public void swim(){

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

    @Override
    public void voice() {

        System.out.println("/////");

    }
}
