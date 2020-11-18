package Intro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String... args){
        System.out.println("hello");

        Cat cat = new Cat();
        cat.move(4);

        Dog dog = new Dog();
        dog.move(3);

        //we can't instantiated with abstract class
        //Animal animal = new Animal();

        //ArrayList lst = new ArrayList();
        List lst = new LinkedList(); //we can create ArrayList or LinkedList using list

        cat.abc(lst);
        cat.initialize(lst);
        cat.xyz(lst);

        cat.initialize(new ArrayList());
    }
}
