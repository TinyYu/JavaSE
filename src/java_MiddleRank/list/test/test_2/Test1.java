package java_MiddleRank.list.test.test_2;


import java.util.ArrayList;
import java.util.List;

/**
 * @author: ly
 * @date: 2020/03/18
 **/
public class Test1 {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<>();
        for (int i = 0;i < 100;i++){
            list.add(new Hero("hero " + i,i));
        }

        for (int i = 0;i < list.size();i++){
            if (i % 8 == 0 && i != 0){
                list.remove(i);
            }
        }

        for (Hero h : list){
            System.out.println(h);
        }
    }
} 
