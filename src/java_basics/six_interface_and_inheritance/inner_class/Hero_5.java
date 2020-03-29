package java_basics.six_interface_and_inheritance.inner_class;


public abstract class Hero_5 {
    public abstract void attack();

    public static void main(String[] args) {
        //在匿名类中使用外部的局部变量damage 必须修饰为final
        int damage = 5;

        //使用本地类AnonymousHero模拟匿名类的隐藏属性机制
        class AnonymousHero extends Hero_5{

            //在attack中使用的damage，真正使用的是这个内部damage，而非外部的
            int damage;

            //事实上的匿名类，会在匿名类里声明一个damage属性，
            //并且使用构造方法初始化该属性的值
            public AnonymousHero(int damage){
                this.damage = damage;
            }
            @Override
            public void attack() {
                damage = 10;
                System.out.printf("进攻手段，造成%d",this.damage);
            }
        }
        Hero_5 h = new AnonymousHero(damage);
    }
}
