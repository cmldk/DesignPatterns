package FacadePattern;

public class HomeTheaterFacade {

    //Whole parts
    private PopCornPopper popper = new PopCornPopper();
    private Lights lights = new Lights();
    private Screen screen = new Screen();
    private Projector projector = new Projector();
    private Amplifier amplifier = new Amplifier();
    private DVDPlayer dvdPlayer = new DVDPlayer();

    public void watchMovie(String movie){
        popper.on();
        lights.off();
        screen.down();
        projector.on();
        amplifier.on();
        amplifier.setVolume(9);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        System.out.println("Movie is ended");
    }

    public void LoungeMusicMood(){
        System.out.println("Lounge music playing");
    }

    public PopCornPopper getPopper() {
        return popper;
    }

    public Lights getLights() {
        return lights;
    }

    public Screen getScreen() {
        return screen;
    }

    public Projector getProjector() {
        return projector;
    }

    public Amplifier getAmplifier() {
        return amplifier;
    }

    public DVDPlayer getDvdPlayer() {
        return dvdPlayer;
    }
}
