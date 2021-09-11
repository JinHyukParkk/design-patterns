package test;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        CommitA commitA = new CommitA(1);

        HashMap<CommitA, Integer> hashMap = new HashMap<>();

        // 객체 저장
        hashMap.put(commitA, 1);
        System.out.println(commitA);
        System.out.println(hashMap.get(commitA));

        // HashMap 값 변경
        hashMap.put(commitA, 2);
        System.out.println(commitA);
        System.out.println(hashMap.get(commitA));

        // 객체 값 변경
        commitA.setValue(2);
        System.out.println(commitA);
        System.out.println(hashMap.get(commitA));

        // 객체 변경 - 레퍼런스 객체이기 때문에 값 달라짐
        commitA = new CommitA(2);
        System.out.println(commitA);
        System.out.println(hashMap.get(commitA));

        // 이전 객체 값과 동일하게 만들어도 새로운 객체임
        commitA = new CommitA(1);
        System.out.println(commitA);
        System.out.println(hashMap.get(commitA));
    }
}
