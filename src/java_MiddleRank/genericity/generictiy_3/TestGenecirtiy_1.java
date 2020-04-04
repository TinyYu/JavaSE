package java_MiddleRank.genericity.generictiy_3;

import java.util.ArrayList;

/**
 * ?extends
 */
public class TestGenecirtiy_1 {
    public static void main(String[] args) {
        ArrayList<APHero> arrayList = new ArrayList<>();
        arrayList.add(new APHero("1"));

        //? extends Hero表示这是一个Hero泛型或Hero泛型的子类泛型
        ArrayList<? extends Hero> heroList = arrayList;

        //heroList的泛型可以是Hero
        //heroList的泛型可以是APHero
        //heroList的泛型可以是ADHero
        //从heroList中取出来的对象，一定可以转型为Hero
        Hero h = heroList.get(0);

        //但是不能再heroList中添加对象,因为heroList的泛型可能是APHero，ADHero
        //heroList.add(new APHero("1"));


    }
}
