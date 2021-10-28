package compound;

public interface QuackObservable {
    // 옵저버 등록
    public void registerObserver(Observer observer);

    // 연락 송신
    public void notifyObservers();
}
