package pl.sda.blok1.composition;

public class Entertainment {
    int volume = 5;

    private boolean isMusicOn(){
        return (volume > 0);
    }
    public void volumeUp () {
        volume = volume + 1;
        System.out.println("Volume Up!!!");
    }
    public void volumeDown(){
        volume = volume - 1;
        System.out.println("Volume Down");
    }
}
