
public abstract class Car {

 static String brand;
 static String seria;
 static String color;
 static int editionYear;
 static boolean used = false;

 public static String getBrand() {
  return brand;
 }

 public static String setBrand(String brand) {
  Car.brand = brand;
  return brand;
 }

 public static String getSeria() {
  return seria;
 }

 public static String setSeria(String seria) {
  Car.seria = seria;
  return seria;
 }

 public static String getColor() {
  return color;
 }

 public static String setColor(String color) {
  Car.color = color;
  return color;
 }

 public static int getEditionYear() {
  return editionYear;
 }

 public static int setEditionYear(int editionYear) {
  Car.editionYear = editionYear;
  return editionYear;
 }

 public static boolean isUsed() {
  return used;
 }

 public static void setUsed(boolean used) {
  Car.used = used;
 }


}