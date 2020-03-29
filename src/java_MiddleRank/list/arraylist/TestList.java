package java_MiddleRank.list.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList存放对象
 **/
public class TestList {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList();
        for (int i = 0;i < 10;i++){
            Hero hero = new Hero("hero" + String.valueOf(i),i);
            list.add(hero);
        }
        System.out.println(list.size());
        list.add(new Hero("1",1));
        System.out.println(list.size());
    }
} 
