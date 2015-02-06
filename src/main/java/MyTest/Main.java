package MyTest;
public class Main {
    public static void main(String args[]) {

        Human jeka = new JekaSemen();
        jeka.age(29);
        jeka.surname("My surname is Semenov\nremember it, peace of shit!");

        Human mike = new Mike();
        mike.age(28);
        mike.surname("My surname is Chervinko");


        System.out.println(mike.name()
                        + " \n\t I`m "
                        + mike.age
                        + " \n\t "
                        + mike.surname
        );

        System.out.println();

        System.out.println(jeka.name()
                        + " \n\t I`m "
                        + jeka.age
                        + " \n\t "
                        + jeka.surname
        );



    }
}