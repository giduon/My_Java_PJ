package ch07_collection;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> coffeList = new ArrayList<String>(); // '<String>' 으로 문자열만으로 제한, 2가지 이상 타입은 Object사용
        coffeList.add("아메리카노");
        coffeList.add("카페라떼");
        coffeList.add("에스프레소");
        coffeList.add("마키야또");
        coffeList.add("카페라떼");

        int idx = -1;
        String findData = "카페라떼";
        idx = coffeList.indexOf(findData);
        System.out.println(findData + "의 인덱스 번호 : " + idx);

        idx = coffeList.lastIndexOf(findData);
        System.out.println(findData + "의 인덱스 번호 : " + idx);

        findData = "카푸치노";
        idx = coffeList.indexOf(findData);
        System.out.println(findData + "의 인덱스 번호 : " + idx);

        //'카푸치노' 항목이 존재하지 않으면, 2번째 위치에 추가해 보세여
        findData = "카푸치노";
        if (coffeList.indexOf(findData) == -1) {
            coffeList.add(2, findData);
        }

        System.out.println("확장 for 구문을 이용한 요소 출력");
        for (String item : coffeList) {
            System.out.println(item);
        }
        System.out.println("요소 크기 : " + coffeList.size());
        System.out.println();

        findData = "콜드브루";
        coffeList.set(5,findData); // .set 값 바꾸기
        for (String item : coffeList) {
            System.out.println(item);
        }
        System.out.println("요소 크기 : " + coffeList.size());
        System.out.println();

        findData = "카푸치노";
        coffeList.remove(findData);
        //coffeList.remove(2);  인덱스 넘버로도 원소 제거 가능

        coffeList.add(findData);

        for (String xx : coffeList) {
            System.out.println(xx);
        }
        System.out.println();

        System.out.println("일반 for 구문으로 요소 출력하기");

        for (int i = 0; i < coffeList.size() ; i++) {
            String data = coffeList.get(i);
            System.out.println(data);
        }

        System.out.println("요소 크기 : " + coffeList.size());
    }
}
