package java_basics.six_interface_and_inheritance.super_test.test_1;

import java_basics.six_interface_and_inheritance.polymorphism.Item;

/**
 * 父类
 */
public class Hero {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度

    public void useItem(Item i){
        i.effect();
    }

    public Hero(){
        System.out.println("Hero构造方法");
    }

    public Hero(String name){
        System.out.println("Hero的有一个参数的构造方法");
        this.name = name;
    }

    public static void main(String[] args) {
        new Hero();
    }
}
