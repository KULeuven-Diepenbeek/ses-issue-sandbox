package be.kuleuven;

import be.kuleuven.sandbox.Haai;
import be.kuleuven.sandbox.SandCastle;
<<<<<<< HEAD
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
