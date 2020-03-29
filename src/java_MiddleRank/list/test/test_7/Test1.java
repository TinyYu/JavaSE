package java_MiddleRank.list.test.test_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: ly
 * @date: 2020/03/19
 **/
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            list.add(i);
        }

        int num = 0;
        for (int i = 0;i < 1000000;i++){
            Collections.shuffle(list);
            if (list.get(0) == 3 && list.get(1) == 1 && list.get(2) == 4){
                num++;
            }
        }
        System.out.println("出现次数:" + num);
        System.out.println("出现概率:" + ((double)num / 1000000));
    }
} 
