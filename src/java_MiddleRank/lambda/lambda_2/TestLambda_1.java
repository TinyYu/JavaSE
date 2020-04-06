package java_MiddleRank.lambda.lambda_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 引用静态方法
 * 引用对象方法
 */
public class TestLambda_1 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> list = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            list.add(new Hero("hero" + i,r.nextInt(1000),r.nextInt(100)));
        }

        System.out.println("初始化后的集合:");
        System.out.println(list);

        HeroChecker checker = new HeroChecker() {
            @Override
            public boolean test(Hero hero) {
                return hero.getHp()>100 && hero.getDamage()<50;
            }
        };

        System.out.println("使用匿名类过滤");
        filter(list,checker);

        System.out.println("使用Lambda表达式");
        filter(list,h -> h.getHp() > 100 && h.getDamage() < 50);

        System.out.println("在Lambda中使用静态方法");
        filter(list,h -> TestLambda_1.testHero(h));

        System.out.println("直接引用静态方法");
        filter(list,TestLambda_1::testHero);

        System.out.println("引用对象方法");
        TestLambda_1 testLambda_1 = new TestLambda_1();
        filter(list,testLambda_1::testHero_1);
    }

    public static boolean testHero(Hero hero){
        return hero.getHp()>100 && hero.getDamage()<50;
    }

    public boolean testHero_1(Hero hero){
        return hero.getHp()>100 && hero.getDamage()<50;
    }

    public static void filter(List<Hero> heros,HeroChecker checker){
        for (Hero hero : heros){
            if (checker.test(hero)){
                System.out.println(hero);
            }
        }
    }
}
