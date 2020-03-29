package java_basics.six_interface_and_inheritance.super_test.test_3;

import java_basics.six_interface_and_inheritance.class_type_conversion.AD;
import java_basics.six_interface_and_inheritance.polymorphism.Item;

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

    //重写useItem，并在其中调用父类的useItem方法
    public void useItem(Item item){
        System.out.println("adhero use item");
        super.useItem(item);
    }
    public static void main(String[] args) {
        ADHero ad = new ADHero();
        Item i = new Item();
        ad.useItem(i);
    }
}
