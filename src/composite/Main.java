package composite;

public class Main {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
        MenuComponent dinnerMenu = new Menu("객체마을 식당 메뉴", "점심 메뉴");
        MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");
        MenuComponent dessertMenu = new Menu("디저트 메뉴", "맛있는 디저트입니다.");

        MenuComponent allMenu = new Menu("전체 메뉴", "전체 메뉴");

        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinnerMenu);
        allMenu.add(cafeMenu);

        dinnerMenu.add(new MenuItem("파스타", "까르보나라", true, 4));
        dinnerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("크로아상", "최고로 부드러움", false, 2));

        Waitress waitress = new Waitress(allMenu);
//        waitress.printMenu();

        waitress.printVegetarianMenu();
    }
}
