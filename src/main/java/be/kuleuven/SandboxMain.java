package be.kuleuven;

<<<<<<< HEAD
import be.kuleuven.sandbox.*;
=======
import be.kuleuven.sandbox.BucketOfWater;
<<<<<<< HEAD
import be.kuleuven.sandbox.Candy;
=======

import be.kuleuven.sandbox.JellyFish;

import be.kuleuven.sandbox.FishNet;

>>>>>>> b7be7bccd54b29d20f50c1a183b994ece629be21
import be.kuleuven.sandbox.SandCastle;
>>>>>>> 01e387cdb6c0c7dbe4fccf2aac5cde4aae2c7e53



import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var list = Arrays.asList(
                new SandCastle(),
                new BucketOfWater(),
<<<<<<< HEAD
                new Candy()
=======
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
>>>>>>> b7be7bccd54b29d20f50c1a183b994ece629be21
        );

        System.out.println("A day at the sea in the sand: \n");
        for (var playItem : list) {
            playItem.play();
        }
    }
}
