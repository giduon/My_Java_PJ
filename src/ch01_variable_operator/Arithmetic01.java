package ch01_variable_operator;

public class Arithmetic01 {
    public static void main(String[] args) {
        int x = 14, y = 5;

        System.out.println("더하기 : " + (x+y)); // 단축키 Ctrl + D (현재줄)커서 복사
        System.out.println("빼기 : " + (x-y)); // (+,-,*,/,%) 5개의 산술연산자
        System.out.println("곱하기 : " + (x*y));
        System.out.println("나누기 : " + (x/y)); // 정수 나누기 정수의 결과는 정수 (*java의 특징)
        System.out.println("나머지 : " + (x%y));

        System.out.println(2 + 3 * 3);
        System.out.println((2 + 3) * 3);
        System.out.println(14/5.0); // 정수<실수 에 따른 실수 형태의 결과값
        System.out.println(14.0/5);

    }
}
