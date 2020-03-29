package java_MiddleRank.list.test.test_10;

import java.util.ArrayList;

/**
 * @author: ly
 * @date: 2020/03/25
 **/
public class Test3 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        MyHashMap myHashMap = new MyHashMap();

        for (int i = 0;i < 100000;i++){
            Hero h = new Hero("hero-" + String.valueOf((int)(Math.random() * 10000)));
            arrayList.add(h);
            myHashMap.put(h.getName(),h);
        }

        System.out.println("ArrayList");
        long srctime = System.currentTimeMillis();
        for (Object o : arrayList){
            Hero hero = (Hero) o;
            if (hero.getName().equals("hero-5555")){
                System.out.println(o);
            }
        }
        long deratime = System.currentTimeMillis();
        System.out.println("ArrayList:" + (deratime - srctime));

        System.out.println("MyHashMap");
        srctime = System.currentTimeMillis();
        System.out.println(myHashMap.get("hero-5555"));
        deratime = System.currentTimeMillis();
        System.out.println("MyHashMap:" + (deratime - srctime));


    }
} 
