package compound;

public class QuackCounter implements Quackable {

    Quackable duck;
    static int numberOfQuack;

    public QuackCounter(Quackable quackable) {
        this.duck = quackable;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuack++;
    }

    public static int getNumberOfQuack() {
        return numberOfQuack;
    }
}
