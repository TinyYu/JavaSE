package java_MiddleRank.lambda.lambda_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 中间操作
 * 对元素进行筛选：
 *  filter 匹配
 *  distinct 去除重复(根据equals判断)
 *  sorted 自然排序
 *  sorted(Comparator<T>) 指定排序
 *  limit 保留
 *  skip 忽略
 * 转换为其他形式的流
 *  mapToDouble 转换为double的流
 *  map 转换为任意类型的流
 */
public class TestLambda_3 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }

        //制造重复数据
        heros.add(heros.get(0));
        System.out.println("初始化集合，最后一个数据重复");
        System.out.println(heros);

        System.out.println("满足条件hp > 100 && damage < 50 的数据");
        heros
                .stream()
                .filter(h -> h.getDamage() < 50 && h.getHp() > 100)
                .forEach(h -> System.out.println(h.getName()));

        System.out.println("去除重复数据,去除标准equals");
        heros
                .stream()
                .distinct() //去重
                .forEach(h -> System.out.println(h.getName()));

        System.out.println("按血量排序");
        heros
                .stream()
                .sorted((h1,h2) -> h1.getHp() >= h2.getHp() ? 1 : -1)
                .forEach(h -> System.out.println(h.getName()));

        System.out.println("保留3个数据");
        heros
                .stream()
                .skip(3)
                .forEach(h -> System.out.println(h.getName()));

        System.out.println("转换为double的Stream");
        heros
                .stream()
                .mapToDouble(Hero :: getHp)
                .forEach(h -> System.out.println(h));

        System.out.println("转换为任意类型的Stream");
        heros
                .stream()
                .map((h) -> h.getName() + " - " + h.getHp() + " - " + h.getDamage())
                .forEach(h -> System.out.println(h));
    }
}
