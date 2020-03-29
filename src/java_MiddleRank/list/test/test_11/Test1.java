package java_MiddleRank.list.test.test_11;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author: ly
 * @date: 2020/03/25
 **/
public class Test1 {
    public static void main(String[] args) {
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //因为set一定是升序，所以任何情况都返回负数就可以倒序
                return o2 - o1;
            }
        };

        //传入比较器
        TreeSet<Integer> treeSet = new TreeSet<>(c);
        for (int i = 0;i < 10;i++){
            treeSet.add(i);
        }
        System.out.println(treeSet);
    }
} 
