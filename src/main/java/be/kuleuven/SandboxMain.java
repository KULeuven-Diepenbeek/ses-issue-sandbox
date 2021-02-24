package be.kuleuven;

import be.kuleuven.sandbox.*;

import java.lang.String;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var list = Arrays.asList(
                new SandCastle(),
                new BucketOfWater(),
                new Candy(),
                new FishingNet(),
                new IceCream(),
                new Jellyfish(),
                new Magazines()

        );

        System.out.println("A day at the sea in the sand: \n");
        for (var playItem : list) {
            playItem.play();
        }
    }
}
