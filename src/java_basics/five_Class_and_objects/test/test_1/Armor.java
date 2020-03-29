package java_basics.five_Class_and_objects.test.test_1;


/**
 * 设计一个类Armor护甲
 * 继承Item类，并且额外提供一个属性ac: 护甲等级 int类型
 *
 * 实例化出两件护甲
 * 名称 价格 护甲等级
 * 布甲 300 15
 * 锁子甲 500 40
 */
public class Armor extends Item{
    int ac;//护甲等级

    public static void main(String[] args) {
        //实例化
        Armor a = new Armor();
        a.ac = 15;
        a.name = "布甲";
        a.price = 300;

        Armor a2 = new Armor();
        a.ac = 40;
        a.name = "锁子甲";
        a.price = 500;
    }
}
