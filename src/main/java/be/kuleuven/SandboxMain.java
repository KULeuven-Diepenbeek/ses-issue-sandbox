package be.kuleuven;

import be.kuleuven.sandbox.Haai;
import be.kuleuven.sandbox.SandCastle;
import be.kuleuven.sandbox.parasol;

import java.lang.String;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var playList = Arrays.asList(
                new SandCastle(),
                new Haai(),
                new parasol()
        );

        System.out.println("A day at the sea in the sand: \n");

        for (var playItem : playList) {
            playItem.play();
        }
    }
}
