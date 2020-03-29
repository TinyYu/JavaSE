package java_MiddleRank.list.listmethod;

import java.util.*;

/**
 * 反转List集合
 **/
public class TestCollection1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            list.add(i);
        }
        System.out.println(list);
        //反转
        Collections.reverse(list);
        System.out.println(list);
    }
} 
