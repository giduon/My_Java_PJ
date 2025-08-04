package ch05_package_inheritance.mybeverage;


public class InheTest04 {
    public static void main(String[] args) {
     //다양한 음료 객체 생성
 //   Beverage04 beverage01 = new Americano0("아메리카노", 4000.0, 200.0);

     Espresso04 espresso = new Espresso04("에스프레소", 5000.0, 2);

     Latte04 latte = new Latte04("라떼", 6000.0, "아몬드 우유");

     //americano.printInfo();
     espresso.printInfo();
     latte.printInfo();
    }
}
