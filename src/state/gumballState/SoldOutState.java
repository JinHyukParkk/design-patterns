package state.gumballState;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("매진되었습니다. 다음 기회에 이용해주세요.");
    }

    public void ejectQuarter() {
        System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않았습니다.");
    }

    public void turnCrank() {
        System.out.println("매진되었습니다.");
    }

    public void dispense() {
        System.out.println("매진입니다.");
    }

    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public String toString() {
        return "매진";
    }
}