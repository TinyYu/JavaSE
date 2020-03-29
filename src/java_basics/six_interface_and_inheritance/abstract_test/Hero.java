package java_basics.six_interface_and_inheritance.abstract_test;

/**
 * 抽象类Hero
 **/
public abstract class Hero {
    String name;
    float hp;

    //抽象方法attack
    //Hero的子类会被要求实现attack方法
    public abstract void attack();
} 
