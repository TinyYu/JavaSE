package java_basics.six_interface_and_inheritance.inner_class;

/**
 * 匿名类
 **/
public abstract class Hero_2 {
    String name;

    //抽象方法
    public abstract void attack();

    public static void main(String[] args) {
        Hero h1 = new Hero();
        //h1对象属于Hero类
        System.out.println(h1);

        //匿名类
        Hero_2 h = new Hero_2() {
            //实现attack方法
            @Override
            public void attack() {
                System.out.println("新的攻击手段");
            }
        };
        h.attack();
        //h这个对象属于Hero_2$1这么一个系统自动分配的类名
        System.out.println(h);
    }
} 
