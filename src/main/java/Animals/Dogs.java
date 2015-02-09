package Animals;

/**
 * Created by user on 2/9/15.
 */
public class Dogs extends Animals{


    public Dogs(String string, Integer integer){


        name = string;
        age = integer;
    }




    public void bite(){

        System.out.println(" I am a dog " + name+ " and i will bite you!!!!");
    }





}
