package java_MiddleRank.list.generic;


import java.util.ArrayList;
import java.util.List;

/**
 * 泛型
 **/
public class TestCollection {
    public static void main(String[] args) {

        //不指定泛型的容器，可以存放任何类型的元素
        List heros = new ArrayList();
        heros.add(new Hero("hero_1",1));
        heros.add(new Item("bz",1));
        //但是对象转型会出现问题
        ////尤其是在容器里放的对象太多的时候，就记不清楚哪个位置放的是哪种类型的对象了
        Hero h1 = (Hero) heros.get(1);
        System.out.println(h1);

        //引入泛型Generic
        //声明容器的时候，指定只能存放Hero类型或其子类
        List<Hero> heroList = new ArrayList<>();
        heroList.add(new Hero("hero_2",2));
        heroList.add(new APHero("aphero_1",1));
    }
}
