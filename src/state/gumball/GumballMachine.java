package state.gumball;

public class GumballMachine {

    // 알맹이 매진
    final static int SOLD_OUT = 0;
    // 동전 없음
    final static int NO_QUARTER = 1;
    // 동전 없음
    final static int HAS_QUARTER = 2;
    // 알맹이 판매
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전은 한 개만 넣어주세요.");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전이 투입되었습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다. 다음 기회에 이용해주세요.");
        } else if (state == SOLD) {
            System.out.println("잠깐만 기다려 주세요. 알맹이가 배출되고 있습니다.");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전이 반환됩니다.");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD) {
            System.out.println("이미 알맹이를 뽑으셨습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않았습니다.");
        }
    }

    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("손잡이는 한번만 돌려주세요.");
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다.");
        } else if (state == HAS_QUARTER) {
            System.out.println("손잡이를 돌리셨습니다.");
            state = SOLD;
            dispense();
        }
    }

    private void dispense() {
        if (state == SOLD) {
            System.out.println("알맹이가 나가고 있습니다.");
            count = count - 1;
            if (count == 0) {
                System.out.println("더 이상 알맹이가 없습니다.");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진입니다.");
        } else if (state == HAS_QUARTER) {
            System.out.println("알맹이가 나갈 수 없습니다.");
        }
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = NO_QUARTER;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\n알맹이 뽑기");
        result.append("총: " + count + " 알맹이");

        result.append("\n알맹이 뽑기는 ");
        if (state == SOLD_OUT) {
            result.append("매진");
        } else if (state == NO_QUARTER) {
            result.append("동전을 기다리는 중");
        } else if (state == HAS_QUARTER) {
            result.append("손잡이 돌리는중 ");
        } else if (state == SOLD) {
            result.append("알맹이 받아랏 !");
        }
        result.append("\n");
        return result.toString();
    }
}