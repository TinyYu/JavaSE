package java_basics.six_interface_and_inheritance.inner_class;

/**
 * 本地类
 */
public abstract class Hero_3 {
    String name;

    public abstract void attack();

    public static void main(String[] args) {
        //与匿名类的区别在于，本地类有了自定义的类名
        class SomeHero extends Hero_3{
            @Override
            public void attack() {
                System.out.println(name + "新的攻击手段");
            }
        }
        SomeHero s = new SomeHero();
        s.name = "tm";
        s.attack();
    }
} 
