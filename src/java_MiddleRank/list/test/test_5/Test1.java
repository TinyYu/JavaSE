package java_MiddleRank.list.test.test_5;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author: ly
 * @date: 2020/03/19
 **/
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Hero> arrayList = new ArrayList<>();
        HashMap<Integer,Hero> map = new HashMap<>();
        for (int i = 0;i < 3000000;i++){
            Hero h = new Hero("hero-" + String.valueOf((int)
                    (Math.random() * 10000)));
            arrayList.add(h);
            map.put(i,h);
        }

        int num = 0;
        long srctime = System.currentTimeMillis();
        for (Hero h : arrayList){
            if (h.getName().equals("hero-5555")){
                num++;
            }
        }
        long desatime = System.currentTimeMillis();
        System.out.println("Arraylist：" + (desatime - srctime));

        int nums = 0;
        srctime = System.currentTimeMillis();
        for (Hero h : map.values()){
            if (h.getName().equals("hero-5555")){
                nums++;
            }
        }
        desatime = System.currentTimeMillis();
        System.out.println("HashMap：" + (desatime - srctime));
    }
} 
