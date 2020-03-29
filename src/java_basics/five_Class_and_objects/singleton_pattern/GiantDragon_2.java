package java_basics.five_Class_and_objects.singleton_pattern;

/**
 * 懒汉式单例模式
 */
public class GiantDragon_2 {
    //私有化构造方法，使得无法通过new实例化对象
    private GiantDragon_2(){
    }

    //准备一个类属性，用于指向一个实例化对象，暂时指向null
    private static GiantDragon_2 instance;
    //返回实例对象
    public static GiantDragon_2 getInstance(){
        //第一次访问的时候，发现instance没有指向任何对象，这是实例化一个对象
        if (instance == null){
            instance = new GiantDragon_2();
        }
        //返回指向对象
        return instance;
    }
}
