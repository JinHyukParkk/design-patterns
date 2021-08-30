package proxy.gumball;

public class GumballMachine {

    String location;
    int count;
    String status;

    public GumballMachine(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public String getStatus() {
        return status;
    }
}
