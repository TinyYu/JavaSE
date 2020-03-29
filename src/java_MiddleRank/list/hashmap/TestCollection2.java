package java_MiddleRank.list.hashmap;


import java.util.HashMap;

/**
 * @author: ly
 * @date: 2020/03/19
 **/
public class TestCollection2 {
    public static void main(String[] args) {
        HashMap<String, Hero> heroHashMap = new HashMap<>();

        //对于HashMap而言，key是唯一的，不可以重复的。
        heroHashMap.put("gareen",new Hero("gareen1",1));
        System.out.println(heroHashMap);

        //以相同的key 把不同的value插入到 Map中会导致旧元素被覆盖，只留下最后插入的元素。
        heroHashMap.put("gareen",new Hero("gareen2",2));
        System.out.println(heroHashMap);

        //清空map
        heroHashMap.clear();
        System.out.println(heroHashMap);

        //value的值可以重复
        Hero h = new Hero("1",1);
        heroHashMap.put("1",h);
        heroHashMap.put("2",h);
    }
} 
