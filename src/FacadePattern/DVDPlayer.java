package FacadePattern;

public class DVDPlayer {

    public void on(){
        System.out.println("Turning on DVD Player");
    }

    public void play(String movie){
        System.out.println("Playing movie " + movie);
    }
}
