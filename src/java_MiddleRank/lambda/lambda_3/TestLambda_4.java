package java_MiddleRank.lambda.lambda_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 结束操作
 * 常见结束操作如下：
 *  forEach() 遍历每个元素
 *  toArray() 转换为数组
 *  min(Comparator<T>) 取最小的元素
 *  max(Comparator<T>) 取最大的元素
 *  count() 总数
 *  findFirst() 第一个元素
 */
public class TestLambda_4 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }

        System.out.println("遍历集合中的每个数据");
        heros
                .stream()
                .forEach(h -> System.out.println(h));

        System.out.println("返回一个数组");
        Object[] hs = heros
                .stream()
                .toArray();
        System.out.println(Arrays.toString(hs));

        System.out.println("返回伤害最低的Hero");
        Hero minDamageHero = heros
                .stream()
                .min((h1,h2) -> h1.getDamage() - h2.getDamage())
                .get();
        System.out.println(minDamageHero);

        System.out.println("返回伤害最高的Hero");
        Hero maxDamageHero = heros
                .stream()
                .max((h1,h2) -> h1.getDamage() - h2.getDamage())
                .get();
        System.out.println(maxDamageHero);

        System.out.println("流中的数据总数");
        long count = heros
                .stream()
                .count();
        System.out.println(count);

        System.out.println("第一个Hero");
        Hero firstHero = heros
                .stream()
                .findFirst()
                .get();
        System.out.println(firstHero);
    }
}
