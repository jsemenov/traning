public class Jigul extends Car implements IAction{

 public void start(){
  System.out.println("Гыр-Хыр-клац-Клац"+"\n\tНифига не заводится");
 }
 public String brand = setBrand("Жигули");
 public String seria = setSeria("Копейка");
 public int editionYear = setEditionYear(1994);
 public String color = setColor("Ржавая");
 public boolean used = true;
}
