package be.kuleuven.sandbox;

public class DikkeToerist implements Playable{
    private boolean isIngegraven;

    public DikkeToerist(boolean isIngegraven) {
        this.isIngegraven = isIngegraven;
    }

    @Override
    public void play() {
        isIngegraven = true;
    }

    public boolean isIngegraven() {
        return isIngegraven;
    }

    public void setIngegraven(boolean ingegraven) {
        isIngegraven = ingegraven;
    }
}
