package ch02_control_statement;

public class MultiIf01 {
    public static void main(String[] args) {
        int tem = 2;
        String alarm ;

        if (tem >= 35){
            alarm = "폭염 경보";
        }else if(tem >= 30){
            alarm = "무더운 날씨";
        }else if(tem >= 20){
            alarm = "쾌적한 날씨";
        }else if(tem >= 10){
            alarm = "쌀쌀한 날씨";
        }else{
            alarm = "추운 날씨";
        }
        System.out.println(tem + "도는 " + alarm + "입니다.");
    }
}
