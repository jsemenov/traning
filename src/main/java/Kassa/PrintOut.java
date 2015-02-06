package Kassa;
import java.io.IOException;
public class PrintOut extends WriteIn implements Interface {

    public void name() {
        System.out.println("\t\t\tПрограмма 'КАССА':");
    }

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




    public void produktName() {
        System.out.print("\nВведите название продукта: ");
    }


    public void produktValue() {
        System.out.print("\tколичество: ");
    }

    @Override
    public void next() {
        System.out.print("\nещё что-нибудь?\n Enter  'Y' or 'N': ");
    }

    @Override
    public void check() {
        for (int i = 0; i < 45; i++) {
            System.out.print("-");
        }
        System.out.printf("\n\n%-4c%-10s%5s%10s%10s", '№', "Товар", "цена", "кол-во", "вместе\n");
    }

    @Override
    public void allPrint() {
            for (int i = 0; i < s4et4ik; i++) {
            System.out.printf("\n%-4d%-10s%5.2f%10d%10.2f", (i + 1), tovar[i], price[i],  value[i], summ[i]);
            allSum += summ[i];
        }
        System.out.println();
        for (int i = 0; i < 45; i++) {
            System.out.print("-");
        }
    }

    @Override
    public void lastPrint() {
        System.out.println("\n\t\t\t\t ВСЕГО:"+ allSum);
    }

    @Override
    public void goodBye() {

        System.out.printf("%-10s%10.2f%4s", "Итого к оплате: \t\t", allSum, " грн");
        System.out.println("\n\nПриходите ещё!");
    }
}
