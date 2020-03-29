package java_basics.six_interface_and_inheritance.interface_test;

/**
 * 魔法英雄
 */
public class APHero extends Hero implements AP{
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
}
