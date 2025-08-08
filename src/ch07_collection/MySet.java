package ch07_collection;

import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Object> setA =new HashSet<Object>();

        setA.add("아메리카노");
        setA.add(123);
        setA.add(false);
        setA.add("아메리카노");

        setA.clear();

        setA.add("아메리카노");
        setA.add("에스프레소");
        setA.add("믹스커피");
        setA.add("카페라떼");

        String findData = "카페떼";

        System.out.println(findData + " 존재여부 : " + setA.contains(findData));

        if (setA.contains(findData)){
            System.out.println(findData + " 있음");
        }else {
            System.out.println(findData + " 없음");
        }
        System.out.println();
        // '마끼야또'가 존재하는 지 확인하고, 없으면 추가

//        String addData = "마끼야또";
//
//        System.out.println(addData + " 존재여부 : " + setA.contains(addData));
//
//        if (setA.contains(addData)){
//            System.out.println(addData + " 있음");
//        }else {
//            System.out.println(addData + " 없음");
//            System.out.println(addData + " 없음으로 추가함");
//        }
//
//        setA.add(addData);

        String addData = "마끼야또";
        if (setA.contains(addData) == false){
            setA.add(addData);
        }

        // remove() 메소드를 사용하여 '믹스커피'를 삭제하고 '삭제 성공' 이라는 문구를 출력해 주세요.
        String aaddData = "믹스커피";

        setA.remove(aaddData);
        if (setA.contains(aaddData) == false) {
            System.out.println(aaddData + "삭제 성공");
        }else {
            System.out.println(aaddData + "는 목록에 존재하지 않습니다");
        }


        System.out.println("확장 for 구문을 이용한 요소 출력");
        // for(타입 단수이름:복수이름){...}
        for(Object item:setA){
            System.out.println(item);
        }


        System.out.println("요소크기 : " + setA.size());
    }
}
