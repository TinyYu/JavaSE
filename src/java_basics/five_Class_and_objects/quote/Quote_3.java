package java_basics.five_Class_and_objects.quote;

/**
 * 一个引用，多个对象
 */
public class Quote_3 {
    String name;//名
    float hp;//血量
    public static void main(String[] args) {
       //使用一个引用来指向多个对象
        Quote_3 q1 = new Quote_3();
       q1 = new Quote_3();
    }
}
