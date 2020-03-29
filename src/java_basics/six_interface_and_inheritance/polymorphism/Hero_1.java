package java_basics.six_interface_and_inheritance.polymorphism;

/**
 * 使用多态
 */
public class Hero_1 {
    String name;
    float hp;

    //只需要创建一个物品的使用方法
    public void useItem(Item i){
        i.effect();
    }

    public static void main(String[] args) {
        Hero_1 h = new Hero_1();
        h.name = "盖伦";

        Item lp = new LifePotion();
        Item mp = new MagicPotion();

        h.useItem(lp);
        h.useItem(mp);

    }
}
