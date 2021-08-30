package proxy.gumball;

public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("봅기 기계 위치: " + machine.getLocation());
        System.out.println("현재 제고 : " + machine.getCount());
        System.out.println("현재 상탸 : " + machine.getStatus());
    }
}
