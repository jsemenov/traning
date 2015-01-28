import java.util.Scanner;

public class Deploy {
    public static void main(String args[]) {


        NewClass newClass = new NewClass();
        Scanner sc = new Scanner(System.in);

        System.out.print("Пссс...\n" +
                "\n\tПарень!\n" +
                "\nдавай я вычислю тебе факториал!\n" +
                "\n\t просто введи сюда число: ");
        int x = sc.nextInt();

        System.out.println("факториал числа " + x + " будет равен " + newClass.calculateFactorial(x));

    }
}
