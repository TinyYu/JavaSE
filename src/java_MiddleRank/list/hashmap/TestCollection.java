package java_MiddleRank.list.hashmap;

import java.util.HashMap;

/**
 * HashMap
 **/
public class TestCollection {
    public static void main(String[] args) {
        //HashMap采用键值对方式存储数据
        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("one","1");
        hashMap.put("tow","2");
        hashMap.put("three","3");

        System.out.println(hashMap.get("one"));
    }
} 
