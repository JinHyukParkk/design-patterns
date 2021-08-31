package proxy.gumball;

import java.rmi.Naming;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count;

        try {
            count = 2;

            gumballMachine =
                    new GumballMachine("test", count);
            Naming.rebind("//" + "test" + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
