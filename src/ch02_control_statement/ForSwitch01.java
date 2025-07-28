package ch02_control_statement;

public class ForSwitch01 {
    public static void main(String[] args) {
        int odd = 0, even = 0;

        for (int i = 1; i < 11; i++){
            switch (i%2) { // 표현식에는 정수나 자료형만을 입력 할 수 있다.
                case 1:
                //case 3:
                //case 5:
                //case 7:
                //case 9:
                    odd += i;
                    break;
                case 0:
                //case 4:
                //case 6:
                //case 8:
                //case 10:
                    even += i;
                    break;
            }
        }
        System.out.println("짝수의 총합 : " + even);
        System.out.println("홀수의 총합 : " + odd);
    }
}
