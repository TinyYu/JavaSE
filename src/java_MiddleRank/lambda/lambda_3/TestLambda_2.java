package java_MiddleRank.lambda.lambda_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 管道源
 */
public class TestLambda_2 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }

        //管道源是集合
        heros
                .stream()
                .forEach(h -> System.out.println(h.getName()));

        //管道源是数组
        Hero[] hs = heros.toArray(new Hero[heros.size()]);
        Arrays.stream(hs)
                .forEach(h -> System.out.println(h.getName()));
    }
}
