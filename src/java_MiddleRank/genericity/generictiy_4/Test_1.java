package java_MiddleRank.genericity.generictiy_4;

import java.util.ArrayList;

/**
 * 子类泛型转父类泛型
 * 父类泛型转子类泛型
 */
public class Test_1 {
    public static void main(String[] args) {
        ArrayList<Hero> hs = new ArrayList<>();
        ArrayList<APHero> aphs = new ArrayList<>();

        /**
         * 子类泛型不可以转为父类泛型
         * 子类泛型aphs指向的是一个APHero泛型的容器，APHero泛型容器不可以存放其他Hero类的子类
         */
        //hs = aphs;

        /**
         * 父类泛型不能转子类
         * Hero泛型容器可以存放其子类，而APHero泛型容器只能存放APHero
         */
        //aphs = hs;

    }
}
