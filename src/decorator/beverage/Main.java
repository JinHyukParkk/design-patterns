package decorator.beverage;

public class Main {

    public static void main(String[] args) {
        // 에스프레소 주문
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ": $" + beverage.cost());

        // 모카 추가
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + ": $" + beverage.cost());

        // 휘핑 추가
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + ": $" + beverage.cost());
    }
}
