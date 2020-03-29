package java_MiddleRank.list.test.test_9;

import java.util.HashMap;

/**
 * @author: ly
 * @date: 2020/03/20
 **/
public class Test1 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("adc","物理");
        hashMap.put("apc","魔法");
        hashMap.put("t","坦克");

        String[] strings1 = hashMap.values().toArray(new String[0]);
        String[] strings2 = hashMap.keySet().toArray(new String[0]);
        hashMap.clear();

        for (int j = 0;j < strings1.length;j++){
            hashMap.put(strings2[j],strings1[j]);
        }
        System.out.println(hashMap);
    }
} 
