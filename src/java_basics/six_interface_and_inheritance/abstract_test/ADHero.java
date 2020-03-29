package java_basics.six_interface_and_inheritance.abstract_test;

/**
 * 继承抽象类Hero
 **/
public class ADHero extends Hero{
    public void physicAttack(){
        System.out.println("物理");
    }
    //实现抽象类中的抽象方法
    @Override
    public void attack() {
        physicAttack();
    }
}
