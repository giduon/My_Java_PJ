package ch04_class;

public class SaramMain04 {
    public static void main(String[] args) {
        Saram04 soo = new Saram04(); // 김철수
        soo.display();
        System.out.println();

        Saram04 hee = new Saram04("박영희", 162.5, 52.5, "독서", "AB"); // 박영희
        hee.display();
        System.out.println();

        // 김유신에 대하여 생성사를 오버로딩해 보세요. 단, 입력하지 않는 취미의 기본 값은 "볼링"이라고 가정합니다.
        Saram04 yusin = new Saram04("김유신", 183.5, 86.3, "O");
        yusin.display();
    }
}
