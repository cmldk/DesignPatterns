package AdapterPattern;

public class TestDuckSimulator {
    public static void main(String... args){

        DuckSimulator duckSimulator = new DuckSimulator();

        duckSimulator.addDuck(new MallardDuck());
        duckSimulator.addDuck(new MallardDuck());

        duckSimulator.flyAll();
        duckSimulator.quackAll();

        //this is not allowed we have to adapt that interface
        //duckSimulator.addDuck(new WildTurkey());

        System.out.println("\n\nTurkey Adapter Part");
        duckSimulator.addDuck(new TurkeyAdapter(new WildTurkey()));
        duckSimulator.flyAll();
        duckSimulator.quackAll();
    }
}
