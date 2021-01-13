package ProxyPattern;

public class TestGumballMachine {

    public static void main(String... args) {
        GumballMachine gm = new GumballMachine("MKSU",3);

        GumballMonitor monitor = new GumballMonitor(gm);
        gm.insertQuarter();
        gm.turnCrank();
        monitor.report();

        /*gm.turnCrank();

        gm.insertQuarter();
        gm.ejectQuarter();

        for (int i=0; i<20; i++){

            gm.insertQuarter();
            gm.turnCrank();
        }

        gm.insertQuarter();*/
    }
}
