package ch01_variable_operator;

public class Increment01 {
    public static void main(String[] args) {

        int x = 5;

        x += 3; //x = x + 3 ; 왼쪽 변수에 오른쪽 값을 더한 후 결과를 왼쪽 변수에 저장
        System.out.println("x : " +  x); //x :8

        x *= 4; //x = x * 4 ; 왼쪽 변수에 오른쪽 값을 곱한 후 결과를 왼쪽 변수에 저장
        System.out.println("x : " +  x); // x : 32

        x %= 5; //x = x % 5
        System.out.println("x : " +  x);

        x -= 1;
        System.out.println("x : " +  x);

        x += 7;
        System.out.println("x : " +  x);
    }
}
