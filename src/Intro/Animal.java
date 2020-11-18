package Intro;

import java.util.List;

public abstract class Animal {
    List lst;
    int location;
    public abstract void move(int distance);

    public void abc(List list){
        list.add("hello");
    }

    public void xyz(List list){
        list.add("xyz");
    }

    public void initialize(List list){
        lst = list;
    }
}
