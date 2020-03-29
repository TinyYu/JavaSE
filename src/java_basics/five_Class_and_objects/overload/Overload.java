package java_basics.five_Class_and_objects.overload;

/**
 * 方法重载
 */
public class Overload extends Hero {
    //攻击方法
    public void attack() {
        System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
    }

    public void attack(Hero h1) {
        System.out.println(name + "对" + h1.name + "进行了一次攻击 ");
    }

    public void attack(Hero h1, Hero h2) {
        System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
    }

    public static void main(String[] args) {
        Overload o = new Overload();
        o.name = "赏金猎人";

        /**
         * 方法名是一样的，但是参数类型不一样
         * 在调用方法attack的时候，会根据传递的参数类型以及数量，自动调用对应的方法
         */
        Hero h1 = new Hero();
        h1 .name = "提莫";
        o.attack(h1);

        Hero h2 = new Hero();
        h2.name = "盖伦";
        o.attack(h1,h2);
    }
}
