package be.kuleuven;
import be.kuleuven.sandbox.*;


import java.lang.String;
import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;
import java.util.Arrays;

public class SandboxMain {

    public static void main(String[] args) {
        var playList = new ArrayList<Playable>();
        playList.add(new SandCastle());
        playList.add(new Haai());
        playList.add(new Koelbox());
        playList.add(new SES_Cursus());
        playList.add(new DikkeToerist(false));
        playList.add(new Schelp());
        playList.add(new Zonnecreme());
        playList.add(new volleybal());

        System.out.println("A day at the sea in the sand: \n");

        for (Playable playItem : playList) {
            playItem.play();
        }
    }
}
