package ch01_variable_operator;

public class PrintMe {
    public static void main(String[] args) {

        String name;
         int age;
         double height;
         double weight;
         String blood;
         char munja;
         boolean bool;

         name = "서기드온";
         age = 30;
         height = 176.5;
         weight = 120;
         blood = "A";
         munja = 'C';
         bool = false;

         String message = "이름 : " + name;
         System.out.println(message);

        String message1 = "나이 : " + age;
        System.out.println(message);

        String message2 = "키 : " + height;
        System.out.println(message2);

        String message3 = "몸무게 : " + weight;
        System.out.println(message3);

    }
}
