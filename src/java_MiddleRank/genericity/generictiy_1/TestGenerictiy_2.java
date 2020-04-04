package java_MiddleRank.genericity.generictiy_1;

import java.util.ArrayList;

/**
 * 存放子类
 */
public class TestGenerictiy_2 {
    public static void main(String[] args) {
        ArrayList<Hero> arrayList = new ArrayList<>();

        //只有Hero和其子类可以存放
        arrayList.add(new APHero());
        arrayList.add(new Hero());
        arrayList.add(new ADHero());
    }
}
