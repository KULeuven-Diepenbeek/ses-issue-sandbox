package be.kuleuven;

import be.kuleuven.sandbox.BucketOfWater;
import be.kuleuven.sandbox.Jellyfish;
import be.kuleuven.sandbox.SandCastle;

import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var list = Arrays.asList(
                new SandCastle(),
                new BucketOfWater(),
                new Jellyfish()
        );

        System.out.println("A day at the sea in the sand: \n");
        for (var playItem : list) {
            playItem.play();
        }
    }
}
