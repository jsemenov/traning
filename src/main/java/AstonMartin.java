public class AstonMartin extends Car implements IAction{
 public void start() {
  System.out.println("В-в-ж-ж-ж-ж!!!");
 }

 public String brand = setBrand("Астон мартин");
 public String seria = setSeria("One-77");
 public int editionYear = setEditionYear(2014);
 public String color = setColor("White-color");
 public boolean used = false;

}