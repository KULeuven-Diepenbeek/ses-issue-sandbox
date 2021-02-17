package be.kuleuven;

import be.kuleuven.sandbox.BucketOfWater;
import be.kuleuven.sandbox.SandCastle;
import be.kuleuven.sandbox.candy;

import java.lang.String;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var list = Arrays.asList(
                new SandCastle(),
				new candy(),
                new BucketOfWater()
        );

        System.out.println("A day at the sea in the sand: \n");
        for (var playItem : list) {
            playItem.play();
        }
    }
}
