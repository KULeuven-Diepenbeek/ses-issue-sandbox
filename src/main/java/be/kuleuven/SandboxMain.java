package be.kuleuven;

import be.kuleuven.sandbox.Haai;
import be.kuleuven.sandbox.SandCastle;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import be.kuleuven.sandbox.Schelp;
>>>>>>> cf962c3490184af0c6b621fc3714d194c19a03f7
import be.kuleuven.sandbox.Zonnecreme;
=======
import be.kuleuven.sandbox.volleybal;
>>>>>>> nieuw

import java.lang.String;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var playList = Arrays.asList(
                new SandCastle(),
                new Haai(),
<<<<<<< HEAD
<<<<<<< HEAD
=======

                new Schelp(),

>>>>>>> cf962c3490184af0c6b621fc3714d194c19a03f7
                new Zonnecreme()
=======
                new volleybal(),
         
>>>>>>> nieuw
        );

        System.out.println("A day at the sea in the sand: \n");

        for (var playItem : playList) {
            playItem.play();
        }
    }
}
