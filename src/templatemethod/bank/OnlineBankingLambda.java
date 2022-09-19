package templatemethod.bank;

import java.util.function.Consumer;

public class OnlineBankingLambda {

    public void processCustomer(int id, Consumer<Customer> makeCustomerHappy) {
        Customer c = new Customer(id, "Hyuk", "T-Shirt");
        makeCustomerHappy.accept(c);
    }
}
