package java_MiddleRank.lambda.test.test_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }

        System.out.println("排序");
        Object[] hero = heros
                .stream()
                .sorted((h1,h2) -> h1.getHp() >= h2.getHp() ? 1 : -1)
                .toArray();
        System.out.println(hero[2]);
    }
}
