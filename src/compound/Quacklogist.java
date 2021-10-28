package compound;

public class Quacklogist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist : " + "duck" + "just quacked");
    }
}
