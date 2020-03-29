package java_MiddleRank.list.listmethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * rotate把List中的数据，向右滚动指定单位的长度
 **/
public class TestCollection5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            list.add(i);
        }
        //滚动
        Collections.rotate(list,2);
        System.out.println(list);
    }
} 
