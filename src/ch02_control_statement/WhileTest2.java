package ch02_control_statement;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        int total = 0, count = 0;
        double avg = 0.0;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("점수 입력 : ");
            int grade = scan.nextInt();

            if (grade <= 0) {
                System.out.println("총점 : " + total);
                avg = (double)total/ count;
                System.out.println("평균 : " + avg);
                break;

            } else {
                total += grade;
                count++;
            }
        }
        scan.close();

    }
}
