package java_basics.five_Class_and_objects.quote;

/**
 * 引用和指向
 */
public class Quote {
    String name;//名
    float hp;//血量
    public static void main(String[] args) {
        //创建一个对象
        new Quote();

        //使用一个引用指向这个对象
        Quote q = new Quote();
    }
}
