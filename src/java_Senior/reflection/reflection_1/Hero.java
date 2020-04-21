package java_Senior.reflection.reflection_1;

/**
 * 获取类对象，会初始化类属性
 **/
public class Hero {
    private String name;
    private float hp;
    private int damage;
    private int id;

    static String copyright;

    static {
        System.out.println("初始化copyright");
        copyright = "版权由Riot Games公司所有";
    }
} 
