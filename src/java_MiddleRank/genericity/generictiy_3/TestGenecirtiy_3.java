package java_MiddleRank.genericity.generictiy_3;

import java.util.ArrayList;

/**
 * 通配符?
 */
public class TestGenecirtiy_3 {
    public static void main(String[] args) {
        ArrayList<Hero> heroArrayList = new ArrayList<>();
        heroArrayList.add(new Hero());
        //? 表示任意泛型
        ArrayList<?> arrayList = heroArrayList;

        //?的缺陷2： 既然?代表任意泛型，那么既有可能是Hero,也有可能是Item
        //所以，放哪种对象进去，都有风险，结果就什么什么类型的对象，都不能放进去
        //arrayList.add(new Hero("1",1));
        //arrayList.add(new Item());
    }
}
