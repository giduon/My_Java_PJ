package ch01_variable_operator;

public class PlusMinus01 {
    public static void main(String[] args) {

        int a =10, b = 20, c;

        c  = ++a + b++; //++a : 연산하기 전 a+1, b++ : 연산한 다음 b+1
        // 3  1  2  4
        System.out.println("a : " + a); // a++ = a+1;
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println();

        c  = a++ + --b;
        // 3  4  2 1
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        a = 15;
        b = 12;
        c  = --a + --b;
        // 4  1  3 2
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

    }
}
