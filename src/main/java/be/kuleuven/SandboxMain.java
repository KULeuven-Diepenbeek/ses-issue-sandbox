package be.kuleuven;

import be.kuleuven.sandbox.Haai;
import be.kuleuven.sandbox.SandCastle;
import be.kuleuven.sandbox.Zonnecreme;

import java.lang.String;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var playList = Arrays.asList(
                new PirateShip(),
                new Zonnecreme(),
                new Haai(),
                new SandCastle()
        );

        System.out.println("A day at the sea in the sand: \n");

        for (var playItem : playList) {
            playItem.play();
        }
    }
}
