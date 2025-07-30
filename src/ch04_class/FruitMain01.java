package ch04_class;

public class FruitMain01 {
    public static void main(String[] args) {
        // 단계 2 : 객체 생성
        // 클래스이름 객체이름 - new 생성자이름( );
        Fruit01 Fruit = new Fruit01();

        Fruit01 apple;
        apple = new Fruit01();

        apple.nationality = "안동";
        apple.name = "사과";
        apple.weight = 5;
        apple.sugarrate = 13 ;
        apple.price = 23900;
        apple.where = "롯데마트";

        System.out.println("원산지 : " + apple.nationality);
        System.out.println("상품명 : " + apple.name);
        System.out.println("중량 : " + apple.weight);
        System.out.println("당도 : " + apple.sugarrate);
        System.out.println("가격 : " + apple.price);
        System.out.println("판매처 : " + apple.where);



    }
}
