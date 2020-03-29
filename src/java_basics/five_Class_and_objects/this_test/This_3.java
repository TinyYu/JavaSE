package java_basics.five_Class_and_objects.this_test;

/**
 * 通过this调用其他构造方法
 */
public class This_3 {
    String name;
    float hp;

    //带一个参数的构造方法
    public This_3(String name) {
        System.out.println("一个参数");
        this.name = name;
    }

    //带两个参数的构造方法
    public This_3(String name, float hp) {
        this(name);//调用一个参数构造方法
        System.out.println("两个参数");
        this.hp = hp;
    }

    public static void main(String[] args) {
        This_3 t = new This_3("提莫",123);
        System.out.println(t.name + "  " + t.hp);
    }
}
