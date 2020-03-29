package java_MiddleRank.list.hashset;

import java.util.HashSet;

/**
 * HashSet
 **/
public class TestCollection1 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("hero");
        System.out.println(names);

        //HashSet中的元素，不能重复
        names.add("hero");
        System.out.println(names);
    }
} 
