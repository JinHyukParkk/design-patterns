package decorator.car;

public class Main {
    public static void main(String[] args) {
        ICar audi = new Audi(1000);
        audi.showPrice();

        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();

        ICar audi4 = new A3(audi, "A4");
        audi4.showPrice();

        ICar audi5 = new A3(audi, "A5");
        audi5.showPrice();
    }
}
