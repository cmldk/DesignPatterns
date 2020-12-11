package Exercises.observer.myclasses;

public class DecimalView implements Observer{

    @Override
    public void update(int num) {display(num);}

    @Override
    public void display(int num){
        System.out.println(num);
    }
}