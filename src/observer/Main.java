package observer;

public class Main {
    public static void main(String[] args) {
        Button button = new Button("버튼");

        button.addListener(new ButtonListener());

        button.click("메시지 전달 : click 1");
        button.click("메시지 전달 : click 2");
        button.click("메시지 전달 : click 3");
        button.click("메시지 전달 : click 4");

    }
}
