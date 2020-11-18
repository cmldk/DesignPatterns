package Intro;

public class Cat extends Animal{
    int location;

    //Composition
    Mover mover = new Mover();

    public void move(int distance){
        location = mover.move(location, distance);
    }
}
