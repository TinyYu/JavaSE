package java_MiddleRank.list.listfor;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: ly
 * @date: 2020/03/18
 **/
public class Test_Listfor {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<>();

        //放5个Hero进入容器
        for (int i = 0;i < 5;i++){
            list.add(new Hero("hero name" + i,i));
        }

        //第一种遍历for蓄循环
        System.out.println("---------for循环-----------");
        for (int i = 0;i < list.size();i++){
            Hero h = list.get(i);
            System.out.println(h);
        }


        //第二种遍历，使用迭代器
        System.out.println("------使用while的iterator--------");
        Iterator<Hero> it = list.iterator();
        //从最开始的位置判断下一个位置是否有数据
        //如果有通过next取出来，并且指针向下移动
        //直到下一个位置没有数据
        while (it.hasNext()){
            Hero h = it.next();
            System.out.println(h);
        }
        System.out.println("-------使用for的iterator---------");
        for (Iterator<Hero> iterator = list.iterator();iterator.hasNext();){
            Hero hero = iterator.next();
            System.out.println(hero);
        }

        System.out.println("-------使用增强型for---------");
        //增强型for循环也有不足：
        //无法用来进行ArrayList的初始化
        //无法得知当前是第几个元素了，当需要只打印单数元素的时候，就做不到了。 必须再自定下标变量。
        for (Hero h : list){
            System.out.println(h);
        }
    }
} 
