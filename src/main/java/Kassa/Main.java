package Kassa;

import java.io.IOException;

public class Main extends WriteIn{//implements Interface
    public static void main(String args[]) throws IOException {

        PrintOut print = new PrintOut();
        WriteIn write = new WriteIn();

        print.name();

        write.WriteIt();
        write.WriteCheck();





    }
    }
