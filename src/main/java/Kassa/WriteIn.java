package Kassa;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class WriteIn {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    PrintOut print = new PrintOut();


    float allSum = 0f;
    float sum = 0f;
    int s4et4ik = 0;
    char yes = 'y';
    int value[] = new int[10];
    String[] tovar = new String[10];
    float[] price = new float[10];
    float[] summ = new float[10];

    public void WriteIt() throws IOException {
    while (yes == 'y') {
        print.produktName();

        tovar[s4et4ik] = sc.next();
        price[s4et4ik] = (float) rand.nextInt(30) + 5;

        print.produktValue();
        value[s4et4ik] = sc.nextInt();

        summ[s4et4ik] = (float) value[s4et4ik] * price[s4et4ik];

        print.next();
        yes = (char) System.in.read();
        System.in.read();
        s4et4ik++;
        }
     }

    public void WriteCheck() {
        print.check();

        float pdv = (float) (allSum - ((allSum) * 0.8));
        int point;
        print.lastPrint();
        System.out.println("\nА также НДС " + pdv);
        if (allSum < 50) {
            point = 0;
            allSum = (pdv + allSum);
        } else if (allSum < 100) {
            point = 5;
            allSum = (float) ((pdv + allSum) * 0.95);
        } else {
            point = 10;
            allSum = (float) ((pdv + allSum) * 0.9);

        }
        System.out.println("Ваших баллов " + point + "\n (скидка " + point + "%) \n");
        print.goodBye();
    }
}