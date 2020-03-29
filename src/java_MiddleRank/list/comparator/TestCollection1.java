package java_MiddleRank.list.comparator;

import java.util.*;

/**
 * @author: ly
 * @date: 2020/03/25
 **/
public class TestCollection1 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero1> heroes = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            heroes.add(new Hero1("hero" + i,r.nextInt(100),r.nextInt(100)));
        }
        System.out.println(heroes);

        //Hero类实现了接口Comparable，即自带比较信息。
        //Collections直接进行排序，无需额外的Comparator
        Collections.sort(heroes);
        System.out.println(heroes);
    }
} 
