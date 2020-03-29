package java_basics.five_Class_and_objects.test.test_7;

/**
 * 使用懒汉式单例模式，把Hero类改造成为单例模式
 */
public class Hero_2 {
    private Hero_2(){}
    private static Hero_2 instance;
    private static Hero_2 getInstance(){
        if (instance == null){
            instance = new Hero_2();
        }
        return instance;
    }
}
