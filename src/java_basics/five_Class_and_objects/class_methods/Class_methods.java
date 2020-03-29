package java_basics.five_Class_and_objects.class_methods;

/**
 * 类方法
 */
public class Class_methods {
    String name;

    //实例方法，对象方法，非静态方法
    //必须有对象才能调用
    public void die(){
        name = "z";
    }

    //类方法，静态方法
    //通过类可以直接调用
    public static void battleWin(){
        System.out.println("battele");
    }

    public static void main(String[] args) {
        Class_methods c = new Class_methods();
        c.name = "盖伦";
        //必须有对象才能调用
        c.die();

        //直接通过类调用
        Class_methods.battleWin();
    }
}
