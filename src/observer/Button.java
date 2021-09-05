package observer;

public class Button {

    private String name;
    private ButtonListener buttonListener;

    public Button(String name) {
        this.name = name;
    }

    public void click(String message) {
        buttonListener.clickEvent(message);
    }

    public void addListener(ButtonListener buttonListener) {
        this.buttonListener = buttonListener;
    }
}
