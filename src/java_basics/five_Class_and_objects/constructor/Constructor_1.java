package java_basics.five_Class_and_objects.constructor;

/**
 * 方法名和类名一样（包括大小写）
 * 没有返回类型
 * 实例化一个对象的时候，必然调用构造方法
 */
public class Constructor_1 {
    String name;

    //方法名和类名一样(包括大小写)
    //没有返回类型
    public Constructor_1(){
        System.out.println("实例化一个对象的时候，必然调用构造方法");
    }

    public static void main(String[] args) {
        //实例化一个对象
        Constructor_1 c = new Constructor_1();
    }
}
