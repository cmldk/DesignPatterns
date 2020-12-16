package AdapterPattern;

import java.util.ArrayList;
import java.util.List;

public class DuckSimulator {

    private List<Duck> ducks = new ArrayList<>();

    public void addDuck(Duck duck){
        ducks.add(duck);
    }

    public void quackAll(){
        for(Duck duck: ducks){
            duck.quack();
        }
    }

    public void flyAll(){
        for(Duck duck: ducks){
            duck.fly();
        }
    }
}
