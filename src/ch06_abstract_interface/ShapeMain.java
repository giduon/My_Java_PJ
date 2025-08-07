package ch06_abstract_interface;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shape = {
            new Triangle("yellow", "black", 15.0, 10.0),
            new Rectangle("red", "green", 20.0, 10.0),
            new Circle("pink", "blue", 5.0, 3.0, 4.0)
        };

        for (int i = 0; i < shape.length; i++) {
            shape[i].display();
            shape[i].draw();
            System.out.println();

        }
        System.out.println("=========================");
        System.out.println("추상 클래스는 불완전 클래스이므로 객체 생성이 불가능합니다. ");
        System.out.println("즉 new 키워드 오른쪽에 올 수 없습니다. ");
        //Shape myshape = new Shape();
    }
}
