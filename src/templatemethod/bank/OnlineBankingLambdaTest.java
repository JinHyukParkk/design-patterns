package templatemethod.bank;

import org.junit.jupiter.api.Test;

class OnlineBankingLambdaTest {

    @Test
    void test() {
        new OnlineBankingLambda().processCustomer(1138, (Customer c) -> System.out.println("hello " + c.getName()));
    }
}
