package Animals;
public abstract class Animals implements IAnimalAction {

    String name;
    Integer age;
    private Integer damage;
    private Integer health;
    private Integer weight;
    private Integer agility;
    private Integer defense;
    private Integer speedFight;

    public void evidencePrint() {
        speedFight = getAgility() * 10;

        System.out.println("\nName " + name + "\n" +
                        "Life-Points " + health * weight + "\n" +
                        "Damage " + damage + "\n" +
                        "Defense " + defense + "\n" +
                        "Evasion " + agility + "%" + "\n" +
                        "Agility " + agility + "\n" +
                        "Speed of fighting " + speedFight
        );
        System.out.println();
    }



    public Integer getSpeedFight() {
        return speedFight;
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
