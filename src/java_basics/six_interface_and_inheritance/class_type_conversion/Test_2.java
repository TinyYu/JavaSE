package java_basics.six_interface_and_inheritance.class_type_conversion;

/**
 * 父类转子类(向下转型)
 *
 * 父类转子类，有的时候行，有的时候不行，所以必须进行强制转换。
 * 强制转换的意思就是 转换有风险，风险自担。
 */
public class Test_2 {
    public static void main(String[] args) {
        Hero h = new Hero();
        ADHero ad = new ADHero();
        APHero ap = new APHero();

        ad = (ADHero) h;
        ap = (APHero) h;

    }
}
