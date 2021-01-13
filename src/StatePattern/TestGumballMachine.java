package StatePattern;

public class TestGumballMachine {

    public static void main(String... args) {
        GumballMachine gm = new GumballMachine(3);

        gm.turnCrank();

        gm.insertQuarter();
        gm.ejectQuarter();

        for (int i=0; i<20; i++){

            gm.insertQuarter();
            gm.turnCrank();
        }

        gm.insertQuarter();
    }
}
