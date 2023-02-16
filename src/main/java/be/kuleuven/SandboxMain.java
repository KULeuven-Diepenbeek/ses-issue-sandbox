package be.kuleuven;

import be.kuleuven.sandbox.*;


import java.lang.String;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var playList = Arrays.asList(
                new SandCastle(),
                new Haai(),
                new SES_Cursus(),
                new DikkeToerist(false),
                new Schelp(),
                new Zonnecreme(),
                new volleybal(),
                new Boek()
        );

        System.out.println("A day at the sea in the sand: \n");

        for (var playItem : playList) {
            playItem.play();
        }
    }
}
