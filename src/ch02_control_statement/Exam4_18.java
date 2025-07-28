package ch02_control_statement;

public class Exam4_18 {
    public static void main(String[] args) {

        int star = 24;

        for (int i = 1; i <= star; i++) {

            System.out.print("*");

            if (i % 7 == 0) {
                System.out.println();
            }


        }

    }
}

