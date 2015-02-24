package MyTest;
public abstract class Human implements Ido{

    protected int age;
    protected String surname;

    
    protected abstract String name();

    protected String surname(String surname){
        this.surname = surname;
        return surname;
    }

    protected int age(int age){
     this.age = age;
     return  age;
    }



}
