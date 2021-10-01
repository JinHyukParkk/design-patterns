package command;

public class Main {

    public static void main(String[] args) {
        Cook cook = new Cook();
        Waitress waitress = new Waitress();

        // 손님에게 웨이트리스 배정
        Customer customer = new Customer(waitress);

        // 손님이 cook의 요리 주문서를 만듬
        customer.createOrder(new BurgerAndFriesOrder(cook));

        // 웨이트리스에게 요청
        customer.hungry();
    }
}
