package FacadePattern;

public class HomeTheaterClient {
    public static void main(String... args){

        HomeTheaterFacade htf = new HomeTheaterFacade();

        //Watch Movie
        htf.watchMovie("Black Swan");

        //End Movie
        htf.endMovie();

        //Start Lounge Music
        htf.LoungeMusicMood();

    }
}
