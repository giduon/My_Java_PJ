package ch02_control_statement;

public class ForTest01 {
    public static void main(String[] args) {
        int dan = 3;
        System.out.println("몇 단을 출력할까요? " + dan);

        for (int i = 1; i < 10 ; i++) {

            System.out.println(dan + " * " + i + " = " + dan*i);
        }
    }
}
