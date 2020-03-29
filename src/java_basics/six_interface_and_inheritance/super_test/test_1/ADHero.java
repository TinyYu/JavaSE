package java_basics.six_interface_and_inheritance.super_test.test_1;

import java_basics.six_interface_and_inheritance.class_type_conversion.AD;

/**
 * 子类
 */
public class ADHero extends Hero implements AD {
    @Override
    public void attae() {
        System.out.println("物理攻击");
    }
    public ADHero(){
        //使用关键字super 显式调用父类带参的构造方法
        System.out.println("ADHero构造方法");
    }

    public ADHero(String name){
        //使用关键字super 显式调用父类带参的构造方法
        super(name);
    }
    public static void main(String[] args) {
        /**
         * 实例化一个ADHero(), 其构造方法会被调用
         * 其父类的构造方法也会被调用
         * 并且是父类构造方法先调用
         * 子类构造方法会默认调用父类的 无参的构造方法
         */
        new ADHero();


        new ADHero("z");
    }
}
