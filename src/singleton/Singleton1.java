package singleton;

// 멀티스레딩 문제 해결 방법 - 동기화
public class Singleton1 {

    private static Singleton1 singleton = null;

    private Singleton1() {

    }

    public static synchronized Singleton1 getInstance() {

        if (singleton == null) {
            singleton = new Singleton1();
        }

        return singleton;
    }
}