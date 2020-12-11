package Exercises.observer.myclasses;

public class HexaDecimalView implements Observer{

    @Override
    public void update(int num) {display(num);}

    @Override
    public void display(int num){
        System.out.println(Integer.toHexString(num));
    }
}