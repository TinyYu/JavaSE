package java_basics.five_Class_and_objects.attribute_initialization;

/**
 * 属性初始化
 */
public class Attribute_initialization {
    String name = "hero";//声明属性的时候初始化
    float maxHP;
    float hp;
    static int item = 9;//声明的时候初始化
    {
        maxHP = 200;//初始化块
    }

    static{
        item = 6;//静态初始化块，初始化
    }
    public Attribute_initialization(){
        hp = 100;//构造方法中初始化
    }

}
