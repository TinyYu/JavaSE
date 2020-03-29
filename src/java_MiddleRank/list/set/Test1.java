package java_MiddleRank.list.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @author: ly
 * @date: 2020/03/25
 **/
public class Test1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        //非顺序存放
        hashSet.add(99);
        hashSet.add(9);
        hashSet.add(999);
        System.out.println(hashSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        //按顺序存放
        linkedHashSet.add(99);
        linkedHashSet.add(9);
        linkedHashSet.add(999);
        System.out.println(linkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        //按从小到大排序
        treeSet.add(99);
        treeSet.add(9);
        treeSet.add(999);
        System.out.println(treeSet);
    }
} 
