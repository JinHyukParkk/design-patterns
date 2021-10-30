package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapSolution {
    public static void main(String[] args) {
        String arr[] = {"A B C D", "A D", "A B D", "B D"};
        String arr1[] = {"JAY", "JAY ELLE JAY MAY", "MAY ELLE MAY", "ELLE MAY", "ELLE ELLE ELLE", "MAY"};
        int k = 3;

        System.out.println(new HashMapSolution().solution(arr1, k));
    }

    public int solution(String[] id_list, int k) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < id_list.length; i++) {
            ArrayList day_count = new ArrayList<String>();

            String arr[] = id_list[i].split(" ");
            for (int j = 0; j < arr.length; j++) {
                int count = 0;

                // key 존재 여부
                if (map.containsKey(arr[j])) {
                    count = map.get(arr[j]);
                }

                // 할인 쿠폰 체크
                if (count < k && !day_count.contains(arr[j])) {
                    map.put(arr[j], ++count);
                    day_count.add(arr[j]);
                }
            }
        }

        Collection<Integer> values = map.values();

        for (int value : values) {
            System.out.println(value);
            answer += value;
        }
        return answer;
    }
}
