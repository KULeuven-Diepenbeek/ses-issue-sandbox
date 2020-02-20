package be.kuleuven;

import be.kuleuven.sandbox.*;

import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var list = Arrays.asList(
                new SandCastle(),
                new BucketOfWater(),
                new Jellyfish(),
                new FishingNet(),
                new Magazines(),
                new IceCream(),
                new Candy()
        );

        System.out.println("A day at the sea in the sand: \n");
        for (var playItem : list) {
            playItem.play();
        }
    }
}
