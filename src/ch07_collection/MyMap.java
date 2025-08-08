package ch07_collection;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> teamMap = new HashMap<String, Integer>();

        teamMap.put("lg", 1);
        teamMap.put("ssg", 2);


        System.out.println("요소 크기 : " + teamMap.size());

        int[] seo = {22,55};
    }
}
