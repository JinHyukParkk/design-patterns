package strategy.validation;

import org.junit.jupiter.api.Test;

class ValidatorTest {

    @Test
    void test() {
        Validator numbericValidator = new Validator(new IsNumberic());
        boolean b1 = numbericValidator.validate("aaa");
        System.out.println(b1);

        Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
        boolean b2 = lowerCaseValidator.validate("bbb");
        System.out.println(b2);
    }

    @Test
    void lambdaTest() {
        Validator numbericValidator = new Validator((String s) -> s.matches("[a-z]+"));
        boolean b1 = numbericValidator.validate("aaaa");
        System.out.println(b1);

        Validator lowerCaseValidator = new Validator((String s) -> s.matches("\\d+"));
        boolean b2 = lowerCaseValidator.validate("bbbb");
        System.out.println(b2);
    }
}
