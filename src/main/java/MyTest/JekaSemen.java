package MyTest;

public class JekaSemen extends Human implements Ido{

    @Override
    protected String name() {
        return "My name is Jeka Semenov";
    }

    @Override
    protected int age(int age) {
        return super.age(age);
    }

    @Override
    protected String surname(String surname) {
        return super.surname(surname);
    }


    @Override
    public boolean eat() {
        return false;
    }

    @Override
    public boolean sleep() {
        return true;
    }
}

