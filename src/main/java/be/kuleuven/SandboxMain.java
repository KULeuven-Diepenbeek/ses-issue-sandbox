package be.kuleuven;

import be.kuleuven.sandbox.BucketOfWater;
import be.kuleuven.sandbox.SandCastle;
import be.kuleuven.sandbox.Candy;
import be.kuleuven.sandbox.FishingNet;
import be.kuleuven.sandbox.IceCream;
import be.kuleuven.sandbox.JellyFish;
import be.kuleuven.sandbox.Magazines;

import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var list = Arrays.asList(
                new SandCastle(),
                new BucketOfWater(),
                new Candy(),
                new FishingNet(),
                new IceCream(),
                new JellyFish(),
                new Magazines()
        );

        System.out.println("A day at the sea in the sand: \n");
        for (var playItem : list) {
            playItem.play();
        }
    }
}
