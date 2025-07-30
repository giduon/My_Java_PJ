package ch04_class;

public class SarmaMain01 {
    public static void main(String[] args) {
        // 단계 2 : 객체 생성
        // 클래스이름 객체이름 = new 생성자이름();
        Saram01 yusin = new Saram01(); // 생성자이름은 클래스이름과 반드시 같아야 한다.

        Saram01 soon;
        soon = new Saram01();

        // 단계 3 : 객체의 멤버 변수에 쓰기 작업
        // '.' 을 멤버 참조 연산자라고 부른다.
        yusin.nationality = "대한민국";
        yusin.name = "김유신";
        yusin.height = 172.5;
        yusin.weight = 72.5;
        yusin.hobby = "당구";
        yusin.blood = "AB";

        // 단계 4 :  객체의 멤버 변수의 값을 출력
        System.out.println("국적 : " + yusin.nationality);
        System.out.println("이름 : " + yusin.name);
        System.out.println("키 : " + yusin.height);
        System.out.println("몸무게 : " + yusin.weight);
        System.out.println("혈액형 : " + yusin.blood);
        System.out.println();

        String message = yusin.showGenderInfo(1);
        System.out.println(message);
        String bmi = yusin.showBmiInfo();
        System.out.println(bmi);
        System.out.println();

        yusin.display();

        soon.nationality = "대한민국";
        soon.name = "유관순";
        soon.height = 165.5;
        soon.weight = 48.5;
        soon.hobby = "축구";
        soon.blood = "B";

        // 단계 4 :  객체의 멤버 변수의 값을 출력
        System.out.println("국적 : " + soon.nationality);
        System.out.println("이름 : " + soon.name);
        System.out.println("키 : " + soon.height);
        System.out.println("몸무게 : " + soon.weight);
        System.out.println("혈액형 : " + soon.blood);
        System.out.println();

        message = soon.showGenderInfo(2);
        System.out.println(message);
        bmi = soon.showBmiInfo();
        System.out.println(bmi);
        System.out.println();

    }
}
