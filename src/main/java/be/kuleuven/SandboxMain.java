package be.kuleuven;

import be.kuleuven.sandbox.DikkeToerist;
import be.kuleuven.sandbox.Haai;
import be.kuleuven.sandbox.SandCastle;

import java.lang.String;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var playList = Arrays.asList(
                new SandCastle(),
                new Haai(),
                new DikkeToerist(false)
        );

        System.out.println("A day at the sea in the sand: \n");

        for (var playItem : playList) {
            playItem.play();
        }
    }
}
