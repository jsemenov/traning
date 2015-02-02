public class Deploy {
 public static void main(String args[]) {
  AstonMartin myCar = new AstonMartin();
  System.out.println(myCar.brand +
                  "\n" + myCar.seria +
                  "\n" + myCar.editionYear +
                  "\n" + (myCar.used ? "Убитая" : "Новесенька!!!"));
  myCar.start();


  Jigul destroyItGodPls = new Jigul();
  System.out.println("\n" + destroyItGodPls.brand +
                  "\n" + destroyItGodPls.seria +
                  "\n" + destroyItGodPls.editionYear +
                  "\n" + (destroyItGodPls.used ? "Убитая" : "Новесенька!!!"));
  destroyItGodPls.start();
 }
}
