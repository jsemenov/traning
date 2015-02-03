package Kassa;
public class PrintOut extends WriteIn implements Interface {

    @Override
    public void name() {
        System.out.println("\t\t\tПрограмма 'КАССА':");

    }

    @Override
    public void produktName() {
        System.out.print("\nВведите название продукта: ");
    }

    @Override
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
