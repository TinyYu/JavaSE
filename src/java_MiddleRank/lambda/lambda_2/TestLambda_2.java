package java_MiddleRank.lambda.lambda_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 引用容器中的对象方法
 */
public class TestLambda_2 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> list = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            list.add(new Hero("hero" + i,r.nextInt(1000),r.nextInt(100)));
        }

        System.out.println("初始化后的集合:");
        System.out.println(list);

        System.out.println("Lambda表达式");
        filter(list,h-> h.getHp() > 100 && h.getDamage() < 50);

        System.out.println("Lambda表达式中调用容器中的对象的matched方法");
        filter(list,h -> h.matched());

        System.out.println("引用容器对象的方法");
        filter(list,Hero::matched);
    }

    public boolean testHero(Hero hero){
        return hero.getHp() > 100 && hero.getDamage() < 50;
    }

    private static void filter(List<Hero> heros,HeroChecker checker){
        for (Hero hero : heros){
            if (checker.test(hero))
                System.out.println(hero);
        }
    }
}
