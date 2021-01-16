package ProxyPattern;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TestGumballMonitor {

    public static void main(String... args) throws RemoteException, NotBoundException {

        //if it is running on a different machine,
        //we should provide the IP of that machine instead of localhost to remote connection
        Registry registry = LocateRegistry.getRegistry("localhost", 2001);
        GumballMachineRemote proxy = (GumballMachineRemote) registry.lookup("GM");
        GumballMonitor monitor = new GumballMonitor(proxy);
        monitor.report();
    }
}
