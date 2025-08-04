package ch05_package_inheritance.mybeverage;

public class Beverage04 {
    private String name; // 음료 이름
    private double price; // 단가

    public Beverage04(){}

    //접근지정자 반환타입 생성자이름(매개변수){...}
    public Beverage04(String name, double price){
        this.name = name;
        this.price = price;
    }

    protected void showInfo() {
        System.out.println("음료 이름 : " + name);
        System.out.println("단가 : " + price);
    }
}
