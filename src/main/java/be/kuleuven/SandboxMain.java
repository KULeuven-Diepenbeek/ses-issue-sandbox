package be.kuleuven;

import be.kuleuven.sandbox.*;

import java.lang.String;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var playList = Arrays.asList(
                new SandCastle(),
                new BucketOfWater(),
                new Icecream(),
                //ik ga voor meer ERRORS
                new JellyFish(),
                new FishingNet()
        );

        System.out.println("Yay!");
        System.out.println("A day at the sea in the sand: \n");

        for (var playItem : playList) {
            playItem.play();
        }
    }
}
