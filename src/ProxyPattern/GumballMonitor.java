package ProxyPattern;

public class GumballMonitor {
    GumballMachine gm;

    public GumballMonitor(GumballMachine gm) {
        this.gm = gm;
    }

    public void report(){
        System.out.println("Gumball Machine : "+ gm.getLocation());
        System.out.println("Current Inventory : "+ gm.getCount());
        System.out.println("Current State : "+ gm.getState());
    }
}
