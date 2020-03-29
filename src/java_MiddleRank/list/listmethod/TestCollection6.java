package java_MiddleRank.list.listmethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * synchronizedList 把非线程安全的List转换为线程安全的List。
 **/
public class TestCollection6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> lists = Collections.synchronizedList(list);
    }
} 
