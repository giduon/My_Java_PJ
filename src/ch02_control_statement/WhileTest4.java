package ch02_control_statement;

import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {
        int total = 0, count = 0;
        double avg = 0.0;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("점수 입력 : ");
            int grade = scan.nextInt();

            if (grade < -10) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else if (grade < 0) {
                grade = -grade;

            } else {
            }

            total += grade;
            count++;
        }
        scan.close();
        System.out.println("총점 : " + total);
        avg = (double)total / count;
        System.out.println("평균 : " + avg);
    }
}
