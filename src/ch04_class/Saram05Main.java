package ch04_class;

public class Saram05Main {
    public static void main(String[] args) {

        // 타입[] 배열명 = new 타입[요소개수];
        int[] arr = new int[3];
        Saram05[] saram = new Saram05[2]; // 배열 정의

        saram[0] = new Saram05("이순신", 190, 90, "말타기", "AB"); // 0번째 객체 생성

        saram[1] = new Saram05("김국현", 175, 87.5, "A"); // 1번째 객체 생성

        for (int i = 0; i< saram.length; i++){
            saram[i].display();
            System.out.println();
        }

        Saram05[] mylist = {
                new Saram05("우라이", 190, 90, "말타기", "AB"),
                new Saram05("로니바", 175, 87.5, "A"),
                new Saram05("쿠라비", 175, 87.5, "A"),
                new Saram05("애니스", 175, 87.5, "A")
        };
        for (int i = 0; i< mylist.length; i++) {
            mylist[i].display();
            System.out.println();
        }
    }
}
