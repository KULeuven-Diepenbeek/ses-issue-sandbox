package be.kuleuven;

import be.kuleuven.sandbox.DikkeToerist;
import be.kuleuven.sandbox.Haai;
import be.kuleuven.sandbox.SES_Cursus;
import be.kuleuven.sandbox.SandCastle;
import be.kuleuven.sandbox.Schelp;
import be.kuleuven.sandbox.Zonnecreme;
import be.kuleuven.sandbox.Playable;
import be.kuleuven.sandbox.volleybal;


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
                new volleybal()
        );

        System.out.println("A day at the sea in the sand: \n");

        for (var playItem : playList) {
            playItem.play();
        }
    }
}
