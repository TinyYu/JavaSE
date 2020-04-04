package java_MiddleRank.genericity.generictiy_3;

import java.util.ArrayList;

/**
 * ?super
 */
public class TestGenecirtiy_2 {
    public static void main(String[] args) {
        //? super Hero表示arrayList的泛型是Hero或Hero父类泛型
        //arrayList的泛型可以是Hero，也可以是Object或者Hero父类泛型
        ArrayList<? super Hero> arrayList = new ArrayList<Object>();
        //可以插入Hero
        arrayList.add(new Hero());
        //也可以插入Hero的子类
        arrayList.add(new APHero("1"));
        arrayList.add(new ADHero());
    }
}
