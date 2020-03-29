package java_basics.six_interface_and_inheritance.super_test.test_2;

import java_basics.six_interface_and_inheritance.class_type_conversion.AD;

/**
 * 子类
 */
public class ADHero extends Hero implements AD {
    int moveSpeed = 500;//移动速度
    @Override
    public void attae() {
        System.out.println("物理攻击");
    }

    public int getMoveSpeed(){
        return this.moveSpeed;
    }

    public int getMoveSpeed2(){
        return super.moveSpeed;
    }

    public static void main(String[] args) {
        ADHero ad = new ADHero();

        System.out.println(ad.getMoveSpeed());
        System.out.println(ad.getMoveSpeed2());
    }
}
