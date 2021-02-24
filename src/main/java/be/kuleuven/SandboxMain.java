package be.kuleuven;

import be.kuleuven.sandbox.BucketOfWater;
<<<<<<< HEAD
import be.kuleuven.sandbox.Icecream;
=======
import be.kuleuven.sandbox.JellyFish;
>>>>>>> 8fe0cd7999af5c7c12e39a7f4d18bb5b5c7cbd9b
import be.kuleuven.sandbox.SandCastle;

import java.lang.String;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var playList = Arrays.asList(
                new SandCastle(),
                new BucketOfWater(),
<<<<<<< HEAD
                new Icecream()
=======
                new JellyFish()
>>>>>>> 8fe0cd7999af5c7c12e39a7f4d18bb5b5c7cbd9b
        );

        System.out.println("Yay!");
        System.out.println("A day at the sea in the sand: \n");

        for (var playItem : playList) {
            playItem.play();
        }
    }
}
