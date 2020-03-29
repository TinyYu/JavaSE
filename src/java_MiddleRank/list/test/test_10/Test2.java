package java_MiddleRank.list.test.test_10;

import java.util.ArrayList;

/**
 * @author: ly
 * @date: 2020/03/25
 **/
public class Test2 {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] c = s.toCharArray();
        for (int i = 0;i < 10000;i++){
            ArrayList<Hero> arrayList = new ArrayList<>();
            arrayList.add(new Hero("hero-" + String.valueOf((int)(Math.random() * 10000))));
            int num = (int)(Math.random() * (10 - 2 + 1) + 2);
            String sbu = "";
            StringBuffer sb = new StringBuffer(sbu);
            for (int j = 0;j < num;j++){
                sb.append(c[(int)(Math.random() * c.length)]);
            }
            myHashMap.put(String.valueOf(sb),arrayList);
        }
        int num = (int)(Math.random() * (10 - 2 + 1) + 2);
        String sbu = "";
        StringBuffer sb = new StringBuffer(sbu);
        for (int j = 0;j < num;j++){
            sb.append(c[(int)(Math.random() * c.length)]);
        }
        System.out.println("key：" + sb);
        System.out.println(myHashMap.get(String.valueOf(sb)));

    }
} 
