package Animals;
public class Cats extends Animals {

    public Cats(String nameAnimal, Integer ageAnimal){
            name = nameAnimal;
            age = ageAnimal;
    }
   public void fight(Cats rival) {

        int lastDamageCat1 = ((getSpeedFight()+getDamage())+getAgility()-rival.getDefense());
        int lastDamageRival =((rival.getSpeedFight()+rival.getDamage())+rival.getAgility()-getDefense());
        System.out.println("Final damage "+name+ " is "+lastDamageCat1);
        System.out.println("Final damage "+rival.name+ " is "+lastDamageRival);

       int lastHealthCat1= (getHealth() * getWeight())-lastDamageRival;
       int lastHealthRival= (rival.getHealth() * rival.getWeight())-lastDamageCat1;


       if (lastHealthCat1>lastHealthRival){
           System.out.println("\n" +name+ " is WINNER"+"\n" +
                   "lees of life after fighting " + lastHealthCat1);
       } else {
           System.out.println("\n" +rival.name+ " is WINNER"+"\n" +
                   "lees of life after fighting " + lastHealthRival);
       }

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
