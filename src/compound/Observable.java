package compound;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable {
    ArrayList<Observer> observers = new ArrayList<>();

    QuackObservable duck;

    public Observable(QuackObservable duck) {
        // Quack오리에 옵저버를 적용한 QuackObservable
        this.duck = duck;
    }

    public void registerObserver(Observer observer) {
        System.out.println("register observer");
        observers.add(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> iter = observers.iterator();
        while(iter.hasNext()) {
            Observer observer = iter.next();
            observer.update(duck);
        }
    }
}
