package ch02_control_statement;

public class DayInMonth {
    public static void main(String[] args) {
        int month = 10;
        int last_day = 0;

        switch (month) {
            case 1:
            case 8:
            case 3:
            case 10:
                last_day = 31;
                break;
            case 4:
            case 6:
            case 5:
            case 12:
            case 9:
                last_day = 30;
                break;
            case 2:
                last_day = 28;
                break;
            default:
                System.out.println("월 입력이 잘못 입력되었습니다.");
        }


        System.exit(0); // 프로그램 강제로 종료하기
        String message = "%d월의 마지막 날은 %d일입니다.\n" ;
        System.out.printf(message, month, last_day) ;
        System.out.println(month + "월의 마지막 날은 " + last_day + "일입니다.") ;


    }
}
