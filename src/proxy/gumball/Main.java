package proxy.gumball;

import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args) throws RemoteException {

        GumballMachine gumballMachine = new GumballMachine("sunam", 3);

        GumballMonitor monitor = new GumballMonitor(gumballMachine);
        monitor.report();

    }
}
