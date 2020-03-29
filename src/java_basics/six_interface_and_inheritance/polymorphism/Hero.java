package java_basics.six_interface_and_inheritance.polymorphism;

/**
 * 不使用多态
 */
public class Hero {
    String name;
    float hp;

    //需要创建两个物品的使用方法
    public void useLifePotion(LifePotion lp){
        lp.effect();
    }
    public void useMagicPotion(MagicPotion mp){
        mp.effect();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "盖伦";

        LifePotion l = new LifePotion();
        MagicPotion m = new MagicPotion();

        h.useLifePotion(l);
        h.useMagicPotion(m);
    }
}
