package singleton;

// 멀티스레딩 문제 해결 방법 - DCL 사용하여 동기화 줄이기
public class Singleton3 {

    private volatile static Singleton3 singleton = null;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (singleton == null) {
            synchronized (Singleton3.class) {
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }

        return singleton;
    }
}
