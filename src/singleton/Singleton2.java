package singleton;

// 멀티스레딩 문제 해결 방법 - 미리 인스턴스 생성
public class Singleton2 {
    private static Singleton2 singleton = new Singleton2();

    private Singleton2() {

    }

    public static synchronized Singleton2 getInstance() {

        return singleton;
    }
}
