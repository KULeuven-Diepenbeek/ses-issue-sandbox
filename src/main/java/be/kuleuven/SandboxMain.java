package be.kuleuven;

<<<<<<< HEAD
import be.kuleuven.sandbox.*;
=======
import be.kuleuven.sandbox.BucketOfWater;

import be.kuleuven.sandbox.JellyFish;

import be.kuleuven.sandbox.FishNet;

import be.kuleuven.sandbox.SandCastle;
>>>>>>> 01e387cdb6c0c7dbe4fccf2aac5cde4aae2c7e53

import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var list = Arrays.asList(
                new SandCastle(),
                new BucketOfWater(),
<<<<<<< HEAD
                new Jellyfish(),
                new FishingNet(),
                new Magazines(),
                new IceCream(),
                new Candy()
=======

                new JellyFish(),

                new FishNet()

>>>>>>> 01e387cdb6c0c7dbe4fccf2aac5cde4aae2c7e53
        );

        System.out.println("A day at the sea in the sand: \n");
        for (var playItem : list) {
            playItem.play();
        }
    }
}
