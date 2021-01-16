package ProxyPattern;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloClient {

    public static void main(String... args) throws RemoteException, NotBoundException {
        //if it is running on a different machine,
        //we should provide the IP of that machine instead of localhost to remote connection
        Registry registry = LocateRegistry.getRegistry("localhost", 2001);
        Hello proxy = (Hello) registry.lookup("Hello");
        String response = proxy.sayHello("Cemal");
        System.out.println(response);
    }
}
