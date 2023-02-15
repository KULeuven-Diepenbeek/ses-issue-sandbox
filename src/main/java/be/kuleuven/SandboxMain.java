package be.kuleuven;

import be.kuleuven.sandbox.Haai;
import be.kuleuven.sandbox.SandCastle;
import be.kuleuven.sandbox.Zonnecreme;

import java.lang.String;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var playList = Arrays.asList(
<<<<<<< HEAD
                new SandCastle()
			new aapje()
=======
                new SandCastle(),
                new Haai(),
                new Zonnecreme()
>>>>>>> f59b14c78b7e4a9e7c45bf971ee8dbaff6f2fe7c
        );

        System.out.println("A day at the sea in the sand: \n");

        for (var playItem : playList) {
            playItem.play();
        }
    }
}
