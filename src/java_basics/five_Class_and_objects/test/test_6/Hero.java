package java_basics.five_Class_and_objects.test.test_6;



/**
 *对象属性的初始化有三种方式
 * 故意把初始化块，放在构造方法下面，问题：
 * 这三种方式，谁先执行？谁后执行？
 *
 * 当对一个对象实例化时，首先会加载实例变量，然后再执行初始化代码块，最后执行构造方法。
 */
public class Hero {
    public String name = "some hero";

    public Hero(){
        name = "one hero";
    }
    {
        name = "the hero";
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        System.out.println(h.name);
    }
}
