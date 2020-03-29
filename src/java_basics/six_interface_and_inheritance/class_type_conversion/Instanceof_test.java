package java_basics.six_interface_and_inheritance.class_type_conversion;

/**
 * instanceof   判断一个引用所指向的对象
 */
public class Instanceof_test {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        ADHero ad = new ADHero();
        APHero ap = new APHero();

        Hero h = ad;

        //判断引用ad指向的对象，是否是ADHero类型
        System.out.println(ad instanceof ADHero);

        //判断引用h指向的对象，是否是ADHero类型
        System.out.println(h instanceof ADHero);

        //判断引用h指向的对象，是否是Hero的子类型
        System.out.println(h instanceof Hero);

        //判断引用h指向的对象，是否是ADHero的类型
        System.out.println(h1 instanceof ADHero);
    }
}
