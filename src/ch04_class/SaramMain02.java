package ch04_class;

public class SaramMain02 {
    public static void main(String[] args) {

        System.out.println(Saram02.nationality);

        Saram02 yusin = new Saram02(); // 객체 생성
        yusin.name = "김유신"; // 값 할당
        yusin.height = 172.5;
        yusin.weight = 72.5;
        yusin.hobby = "당구";
        yusin.blood = "AB";

        Saram02 soon = new Saram02();
        soon.name = "유관순";
        soon.height = 165.5;
        soon.weight = 48.5;
        soon.hobby = "축구";
        soon.blood = "B";

        yusin.nationality = "한국";
        System.out.println(soon.nationality);
        System.out.println(Saram02.nationality);
        System.out.println();

        yusin.display(); // 메소드를 호출하기
        System.out.println();
        soon.display();
    }
}
