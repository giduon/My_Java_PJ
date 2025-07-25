package ch01_variable_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a= 3, b = 50;
        int result = a>=b ? a-b : b-a; // 3항연산자
        System.out.println("절대 값 : " + result);

        int x = 10;
        result = x%2 == 0 ? x+3 : x*x;
        System.out.println("결과 : " + result);

        x = 10;
        int y = 10;

        result = x >= y? x : y ;
        System.out.println("큰 수 : " + result);

        result = x - y <= 0? x : y ;
        System.out.println("작은 수 : " + result);
        System.out.println();

        x = 3;
        y = 12;

        String result1 = y % x == 0 ? "yes" : "no";
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println("x는y의 약수인가 : " + result1);

        int su = 7;
        // 숫자 7은(는) 홀수입니다.
        String message;
        message = su%2 == 0 ? "숫자 " + su +"은(는) 짝수입니다." : "숫자 " + su +"은(는) 홀수입니다.";
        System.out.println(message);


        // 숫자 7은(는) 홀수입니다.
        String msg = su%2 ==0 ? "짝수" : "홀수";
        message = "숫자 " + su + "은(는) " +msg +"입니다.";
        System.out.println(message);

        int score = 25; // 65점 이상이면 합격
        // 85점이므로 합격입니다.
        String scoreMessage;
        scoreMessage = score >=65 ? score+"점이므로 합격입니다.": score+"점이므로 불합격입니다.";
        System.out.println(scoreMessage);

        msg = score >= 65 ? "합격" : "불합격" ;
        message = score + "점이므로 " + msg + "입니다. ";
        System.out.println(message);

        int i = (int)12.6;
        System.out.println((double)i);

        int result2 = 'a';  // 'a'는 askii 코드로 97이다
        System.out.println(result2);
        result2 = 'b';
        System.out.println(result2);

        System.out.println('a'-'b');
    }
}
