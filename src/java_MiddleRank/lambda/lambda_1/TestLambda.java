package java_MiddleRank.lambda.lambda_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class TestLambda {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> list = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            list.add(new Hero("hero" + i,r.nextInt(1000),r.nextInt(100)));
        }

        System.out.println("初始化后的集合:");
        System.out.println(list);
        System.out.println("筛选出hp > 100 && damange < 50 的hero");
        filter(list);


        //匿名类方法
        System.out.println("使用匿名类方法筛选出hp > 100 && damange < 50 的hero");
        HeroChecker checker = new HeroChecker() {
            @Override
            public boolean test(Hero hero) {
                return (hero.getHp() > 100 && hero.getDamage() < 50);
            }
        };
        filter_1(list,checker);

        //Lambda方式
        System.out.println("使用Lamdba的方式，筛选出 hp>100 && damange<50的英雄");
        filter_1(list,h->h.getHp() > 100 && h.getDamage() < 50);
    }

    //普通方法
    public static void filter(List<Hero> heros){
        for (Hero hero : heros){
            if (hero.getHp() > 100 && hero.getDamage() < 50){
                System.out.println(hero);
            }
        }
    }

    //匿名类方法
    public static void filter_1(List<Hero> heros,HeroChecker checker){
        for (Hero hero : heros){
            if (checker.test(hero)){
                System.out.println(hero);
            }
        }
    }
}
