package Animals;
public abstract class Animals implements IAnimalAction {

    String name;
    Integer age;

    public void evidencePrint() {

        System.out.println("\nName "+name+"\n" +
                        "Life-Points "+getHealth()*getWeight()+"\n" +
                        "Damage "+getDamage()+"\n" +
                        "Defense "+getDefense()+"\n" +
                        "Evasion "+getAgility()+"%"
        );
        System.out.println();
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
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

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }


    private Integer damage;
    private Integer health;
    private Integer weight;
    private Integer agility;
    private Integer defense;


    @Override
    public void voice() {

        System.out.println(" i don't know who am I");

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

        System.out.println(" i want fight");

    }

}
