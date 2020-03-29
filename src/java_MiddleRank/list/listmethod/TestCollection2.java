package java_MiddleRank.list.listmethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 用于混淆List
 **/
public class TestCollection2 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList();
        for (int i = 0;i < 10;i++){
            number.add(i);
        }
        System.out.println(number);
        //混淆
        Collections.shuffle(number);
        System.out.println(number);
    }
} 
