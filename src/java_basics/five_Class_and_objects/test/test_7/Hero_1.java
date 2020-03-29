package java_basics.five_Class_and_objects.test.test_7;




/**
 * 使用饿汉式单例模式, 把Hero类改造成为单例模式
 */
public class Hero_1 {
    private Hero_1(){
    }

    private static Hero_1 instance = new Hero_1();

    private static Hero_1 getInstance(){
        return instance;
    }
}
