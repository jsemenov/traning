package Animals;
public class Cats extends Animals {

    public Cats(String nameAnimal, Integer ageAnimal){
            name = nameAnimal;
            age = ageAnimal;
    }





    public void fight(Cats rival) {
        setEvasion(getAgility()/100);
        int lastDamageCat1 = ((getSpeedFight()+getDamage())+getAgility()-rival.getDefense())*rival.getEvasion();
        int lastDamageRival =((rival.getSpeedFight()+rival.getDamage())+rival.getAgility()-getDefense())*getEvasion();
        int lastHealthCat1;
        int lastHealthRival;

        System.out.println("Final damage "+getName()+ " is "+lastDamageCat1);
        System.out.println("Final damage "+rival.getName()+ " is "+lastDamageRival);

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
