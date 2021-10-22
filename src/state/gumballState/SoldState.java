package state.gumballState;

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("잠깐만 기다려주세요. 알맹이가 나가고 있습니다.");
    }

    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑았습니다.");
    }

    public void turnCrank() {
        System.out.println("손잡이는 한번만 돌려주세요.");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("이제 알맹이가 없습니다.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    public void refill() { }

    public String toString() {
        return "dispensing a gumball";
    }
}

