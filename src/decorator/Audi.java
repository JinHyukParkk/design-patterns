package decorator;

public class Audi implements ICar {

    private int cost;

    public Audi(int cost) {
        this.cost = cost;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void showPrice() {
        System.out.println("Audi의 가격은 " + this.cost + "원 입니다.");
    }
}
