package adapter.duck;

public class Main {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says..");
        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println();

        System.out.println("The Duck says..");
        testDuck(duck);
        System.out.println();

        System.out.println("The TurkeyAdapter says..");
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
