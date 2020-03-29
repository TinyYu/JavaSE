package java_MiddleRank.list.test.test_8;

import java.util.HashSet;

/**
 * @author: ly
 * @date: 2020/03/19
 **/
public class Test1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0;i < 50;i++){
            hashSet.add((int)(Math.random() * 9999));
        }

        for (Integer i : hashSet){
            System.out.printf("%d ",i);
        }
    }
} 
