package java_MiddleRank.genericity.generictiy_1;

import java.util.ArrayList;

/**
 * 使用泛型和不适用泛型的区别
 */
public class TestGenerictiy_1 {
    public static void main(String[] args) {
        NoGenerictiy();
        YesGenericity();
    }

    public static void NoGenerictiy(){
        ArrayList arrayList = new ArrayList();
        //ArrayList 默认接受Object类型的对象，所有对象都可以放进ArrayList中
        arrayList.add(new APHero());
        arrayList.add(new ADHero());
        //get(0) 返回的类型是Object,需要进行强制转换才可以得到APHero类型或者ADHero类型。
        APHero ap = (APHero) arrayList.get(0);
        ADHero ad = (ADHero) arrayList.get(1);
    }

    public static void YesGenericity(){
        ArrayList<APHero> arrayList = new ArrayList<>();

        //只能存放APHero类型
        arrayList.add(new APHero());
        //arrayList.add(new Hero());
        //arrayList.add(new ADHero());

        //不需要类型转换
        APHero ap = arrayList.get(0);
    }
}
