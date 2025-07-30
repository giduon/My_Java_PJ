package ch04_class;

public class Saram01 {
    // 클래스란 객체를 만들어내기 위한 설계도면과 같다. ex)붕어빵틀 ㅋ

    // 멤버 변수들 (기본 값이 존재)
    String nationality;
    String name;
    double height;
    double weight;
    String hobby;
    String blood;

    //반환타입 메소드이름( 매게 변수 리스트{ ...}
    String showGenderInfo(int juminno){
        String gender = "";

        if (juminno == 1 || juminno ==3){
            gender = "남자";
        }else {
            gender = "여자";
        }

        String message = name + "님은 " + gender + "입니다.";
        return message;
    }

    String showBmiInfo(){

        double newHeight = height/ 100.0; // 센티미터를 미터로 변환
        double rate = weight / (newHeight * newHeight); //bmi 공식에 의하여 계산
        String bmi = ""; //결과를 저장할 문자열

        if (rate >= 25.00){
            bmi = "비만";
        }else if(rate >= 23.00){
            bmi = "과체중";
        }else if(rate >= 18.00) {
            bmi = "정상";
        }else {

            bmi = "저체중";
        }

        String message = name + "님은 " + bmi + "입니다.";
        return message;

    }

    void display(){
        System.out.println(name + "님의 신상 정보");
        System.out.println("국적 : " + nationality);
        System.out.println("이름 : " + name + "님");
        System.out.println("키 : " + height);
        System.out.println();
    }
}
