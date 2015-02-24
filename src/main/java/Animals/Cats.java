package Animals;
public class Cats extends Animals {

    public Cats(String nameAimal, Integer ageAnimal){
            name = nameAimal;
            age = ageAnimal;
    }


    @Override
    public void fight() {
        System.out.println("REX");
    }



    @Override
    public void voice() {
        System.out.println("now i am a cat "+ name +" and says  - myau!");
    }

    @Override
    public void sleep() {
        System.out.println("now i am a cat " + name +" and i go sleeps");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void move(){
        System.out.println("now i am a cat " + name + " and i do some move");


    }



    public void drinkMilk(){
        System.out.println(name + " drinking milk");
    }


    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
