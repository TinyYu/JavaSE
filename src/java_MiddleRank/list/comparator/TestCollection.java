package java_MiddleRank.list.comparator;

import java.util.*;

/**
 * @author: ly
 * @date: 2020/03/25
 **/
public class TestCollection {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heroes = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            heroes.add(new Hero("hero" + i,r.nextInt(100),r.nextInt(100)));
        }
        System.out.println(heroes);

        //直接调用sort会出现编译错误，因为Hero有各种属性
        //到底按照哪种属性进行比较，Collections也不知道，不确定，所以没法排
        //Collections.sort(heros);

        //引入Comparator，指定比较算法
        Comparator<Hero> c = new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                //按照hp比较
                if (o1.getHp() >= o2.getHp()){
                    return 1;//正数表示o1比o2大
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(heroes,c);
        System.out.println(heroes);
    }
} 
