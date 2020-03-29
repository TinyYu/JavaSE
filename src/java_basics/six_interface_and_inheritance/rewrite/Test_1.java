package java_basics.six_interface_and_inheritance.rewrite;

/**
 * LifePotion 继承 Item
 * LifePotion重写effect方法
 * 调用重写的方法
 */
public class Test_1 {
    public static void main(String[] args) {
        LifePotion l = new LifePotion();
        Item i = new Item();

        /**
         * 调用重写的方法
         * 调用就会执行重写的方法，而不是从父类的方法
         * 所以LifePotion的effect会打印：
         * "血瓶使用后，可以回血"
         */
        l.effect();
        i.effect();
    }
}
