package ch01_variable_operator;

import java.sql.SQLOutput;

public class Add {
    public static void main(String[] args) {
        // 변수를 선언(정의)
        int x;  // 정수형 데이터를 위하여 변수x
        int y;
        int z;

        x = 3;
        y = 5;
        z = x+y;

        String message ;

        message = x + "더하기" + y + "는(은)" + z + "입니다.";
        System.out.println(message);

        x = 4;
        y = 8 ;
        z = x * y ;


        message = x + "곱하기" + y + "는(은)" + z + "입니다.";
        System.out.println(message);
    }
}
