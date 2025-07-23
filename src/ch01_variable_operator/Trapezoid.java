package ch01_variable_operator;

import java.sql.SQLOutput;

public class Trapezoid {
    public static void main(String[] args) {

        int bottom, top, height, area;

        bottom = 20;
        top = 10;
        height = 15;
        area = (bottom+top) * height / 2;

        String result = "밑변 : " + bottom;
        result = result + "\n윗변 :" + top;
        result = result + "\n높이 :" + height;
        result = result + "\n면적 :" + area;
        System.out.println(result);
    }
}
