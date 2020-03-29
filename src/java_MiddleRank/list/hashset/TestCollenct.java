package java_MiddleRank.list.hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 遍历
 **/
public class TestCollenct {
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<>();

        for (int i = 0;i < 20;i++){
            number.add(i);
        }

        //set不提供get方法来获取指定位置的元素
        //方式1:使用迭代器
        for (Iterator<Integer> iterator = number.iterator();iterator.hasNext();){
            Integer i = iterator.next();
            System.out.println(i);
        }

        //方式2:增强型for
        for (Integer i : number){
            System.out.println(i);
        }
    }
} 
