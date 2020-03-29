package java_basics.six_interface_and_inheritance.interface_test;

/**
 * 物理攻击英雄
 */
public class ADHero extends Hero implements AD{
    //重写接口方法
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}
