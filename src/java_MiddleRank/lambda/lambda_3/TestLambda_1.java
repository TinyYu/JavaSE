package java_MiddleRank.lambda.lambda_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 聚合操作遍历数据
 */
public class TestLambda_1 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }

        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("查询条件：hp>100 && damage<50");
        System.out.println("通过传统操作方式找出满足条件的数据：");

        for (Hero h : heros){
            if (h.getDamage() < 50 && h.getHp() > 100){
                System.out.println(h.getName());
            }
        }

        System.out.println("通过聚合操作方式找出满足条件的数据:");
        heros
                .stream()
                .filter(h -> h.getHp() > 100 && h.getDamage() < 50)
                .forEach(h -> System.out.println(h.getName()));
    }
}
