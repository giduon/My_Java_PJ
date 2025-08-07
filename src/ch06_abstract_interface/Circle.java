package ch06_abstract_interface;

public class Circle extends Shape {
    private double raidus; //반지름
    private double xpos ; // x좌표
    private double ypos ; // y좌표

    public Circle(String linecolor, String fillcolor, double raidus, double xpos, double ypos) {
        super(linecolor, fillcolor);
        this.raidus = raidus;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    @Override
    public double calcArea() {
        return 3.14 * this.raidus * raidus;
    }

    @Override
    public double calcPerimeter() {
        return 3.14 * this.raidus * 2.0;
    }

    @Override
    public void display() {
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("원형 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);
        System.out.println("원 중심 : (" + this.xpos + "," + this.ypos + ")");
    }


}
