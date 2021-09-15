package factory.pizzas;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("I ordered a " + pizza.getName());
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("I ordered a " + pizza.getName());
        System.out.println(pizza);
    }
}
