package java_basics.five_Class_and_objects.quote;

/**
 * 多个引用，一个对象
 */
public class Quote_2 {
    String name;//名
    float hp;//血量
    public static void main(String[] args) {
       //使用一个引用来指向这个对象
        Quote_2 q1 = new Quote_2();
        Quote_2 q2 = q1;//q2指向q1所指向的对象
        Quote_2 q3 = q1;
        Quote_2 q4 = q2;

        //q1,q2,q3,q4四个引用都指向同一个对象
    }
}
