package Animals;

public abstract class Animals implements IAnimalAction{


    String name;
    Integer age;

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    private Integer strength;
   private Integer health;
   private Integer weight;
   private Integer agility;

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
    @Override
    public void fight() {

        System.out.println("now i  cant fight");

    }

}
