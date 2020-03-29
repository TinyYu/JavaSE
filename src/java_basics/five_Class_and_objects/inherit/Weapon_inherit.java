package java_basics.five_Class_and_objects.inherit;

/**
 * 武器类Weapon_inherit继承Item
 * Weapon自己没有设计name和price,但是通过继承Item类，也具备了name和price属性
 */
public class Weapon_inherit extends Item{
    int damage;//攻击力

    public static void main(String[] args) {
        Weapon_inherit w = new Weapon_inherit();
        w.damage = 56;//damage属性在类Weapon中新设计的
        //name,price属性，是从Item中继承来的，就不需要重复设计了
        w.name = "无尽";
        w.price = 3600;
    }
}
