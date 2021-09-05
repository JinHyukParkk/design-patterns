package observer;

public class ButtonListener implements IListener{
    @Override
    public void clickEvent(String event) {
        System.out.println(event);
    }
}
