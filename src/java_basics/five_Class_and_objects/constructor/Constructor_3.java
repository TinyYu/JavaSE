package java_basics.five_Class_and_objects.constructor;

/**
 * 有参构造方法
 */
public class Constructor_3 {
    String name;
    int hp;
    //有参的构造方法
    //默认的无参的构造方法就失效了
    public Constructor_3(String heroname){
        name = heroname;
    }

    public static void main(String[] args) {
        Constructor_3 c = new Constructor_3("盖伦");
    }
}
