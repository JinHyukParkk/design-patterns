package state.gumballState;

public interface State {

    // 동전 투입
    public void insertQuarter();

    // 동전 없음
    public void ejectQuarter();

    // 손잡이 돌림
    public void turnCrank();

    // 알맹이 꺼냄
    public void dispense();

    // 동전 반환
    public void refill();
}