package java_MiddleRank.lambda.test.test_1;

import java_MiddleRank.lambda.lambda_1.Hero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test_1 {
    public static void main(String[] args) {
        Random r = new Random();
        List<java_MiddleRank.lambda.lambda_1.Hero> list = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            list.add(new Hero("hero" + i,r.nextInt(1000),r.nextInt(100)));
        }

        System.out.println("初始化后的集合:");
        System.out.println(list);
        System.out.println("Lambda排序");
        Collections.sort(list,((o1,o2) -> (int) (o2.getHp() - o1.getHp())));
    }
}
