package java_MiddleRank.list.test.test_1;

import java.util.ArrayList;

/**
 * @author: ly
 * @date: 2020/03/18
 **/
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Hero> arrayList = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            Hero h = new Hero("hero " + String.valueOf(i),i);
            arrayList.add(h);
        }

        for (Hero h : arrayList){
            if (h.getName().equals("hero 1")){
                System.out.println(h);
            }
        }
    }
} 
