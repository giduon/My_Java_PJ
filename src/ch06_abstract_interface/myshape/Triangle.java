package ch06_abstract_interface.myshape;

public class Triangle extends Shape {
    private double width ; // 너비
    private double height ; // 높이

    // 반환타입 기입x, 생성자의 이름은 클래스와 동일, 가급적 매개변수 이름과 인스턴스 이름은 같게
    public Triangle(String linecolor, String fillcolor, double width, double height) {
        super(linecolor, fillcolor);
        this.width = width;
        this.height = height;
    }


    @Override // 부모 클래스와 추상 메소드를 오버라이딩 했습니다.
    public double calcArea() {//각 클래스는 각자의 맡은 영할을 여기에 구현하면되니다.
        return this.width * this.height / 2.0;
    }

    @Override
    public double calcPerimeter() {
        return 20.0;
    }

    @Override
    public void display() {
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("삼각형 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);
    }
}
