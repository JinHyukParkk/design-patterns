package templatemethod.bank;

public class Customer {

    int id;

    String name;

    String order;

    public Customer(int id, String name, String order) {
        this.id = id;
        this.name = name;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOrder() {
        return order;
    }
}
