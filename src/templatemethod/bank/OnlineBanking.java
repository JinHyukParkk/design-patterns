package templatemethod.bank;

public abstract class OnlineBanking {

    public void processCustomer(int id) {
        Customer c = new Customer(id, "Hyuk", "T-Shirt");
        makeCustomerHappy(c);
    }

    abstract void makeCustomerHappy(Customer c);
}
