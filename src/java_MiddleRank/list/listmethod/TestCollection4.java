package java_MiddleRank.list.listmethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 用于交换List集合中两个数据的位置
 **/
public class TestCollection4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            list.add(i);
        }
        Collections.swap(list,0,9);
        System.out.println(list);
    }
} 
