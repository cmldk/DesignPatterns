package StatePattern;

public class TestGumballMachine {

    public static void main(String... args) {
        GumballMachine gm = new GumballMachine(3);

        gm.turnCrank();

        gm.insertQuarter();
        gm.ejectQuarter();

        gm.insertQuarter();
        gm.turnCrank();

        gm.insertQuarter();
        gm.turnCrank();

        gm.insertQuarter();
        gm.turnCrank();

        gm.insertQuarter();
    }
}
