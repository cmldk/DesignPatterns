package Exercises.observer.myclasses;

public class BinaryView implements Observer{

    @Override
    public void update(int num) {display(num);}

    @Override
    public void display(int num){
        System.out.println(Integer.toBinaryString(num));
    }

}