package proxy.browser;

public class Main {

    public static void main(String[] args) {
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();


        IBrowser iBrowser = new BrowserProxy("www.naver.com");
        iBrowser.show();
        iBrowser.show();
        iBrowser.show();
    }
}
