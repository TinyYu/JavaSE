package java_basics.six_interface_and_inheritance.interface_test;

/**
 * 继承多个接口
 */
public class AD_AP_Hero extends Hero implements AD,AP{
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
}
