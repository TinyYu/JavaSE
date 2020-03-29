package java_basics.six_interface_and_inheritance.class_type_conversion;

/**
 * 子类转父类(向上转型)
 *
 * 所谓的转型，是指当引用类型和对象类型不一致的时候，才需要进行类型转换
 */
public class Test_1 {
    public static void main(String[] args) {
        Hero h = new Hero();
        ADHero ad = new ADHero();

        //把ad引用所指向的对象的类型是ADHero
        //h引用的类型是Hero
        //把ADHero当做Hero使用，一定可以
        h = ad;
    }
}
