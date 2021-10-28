package compound;

public class Main {
    public static void main(String[] args) {
        new Main().simulate(new CountingDuckFactory());
    }

    void simulate(AbstractDuckFactory duckFactory) {
//        Quackable mallardDuck = new MallardDuck();
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quacklogist quacklogist = new Quacklogist();
        mallardDuck.registerObserver(quacklogist);

        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Quackable mallardDuckOne = duckFactory.createMallardDuck();
        Quackable mallardDuckTwo = duckFactory.createMallardDuck();
        Quackable mallardDuckThree = duckFactory.createMallardDuck();

        flockOfDucks.add(mallardDuckOne);
        flockOfDucks.add(mallardDuckTwo);
        flockOfDucks.add(mallardDuckThree);

        System.out.println("### Duck ###");

        simulate(flockOfDucks);
    }

    void simulate(Quackable duck) {
        duck.quack();
    }

}
