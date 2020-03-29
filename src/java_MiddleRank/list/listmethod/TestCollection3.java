package java_MiddleRank.list.listmethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 用于排序List
 **/
public class TestCollection3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.println(list);

        //排序
        Collections.sort(list);
        System.out.println(list);
    }
} 
