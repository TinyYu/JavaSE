package java_basics.six_interface_and_inheritance.object;

/**
 * equals() 用于判断两个对象的内容是否相同
 *
 * 假设，当两个英雄的hp相同的时候，我们就认为这两个英雄相同
 */
public class Equals {
    String name;
    float hp;

    public boolean equals(Object o){
        //用于判断前面的对象是否是后面的类，或者其子类、实现类的实例。
        //使用instanceof关键字做判断时， instanceof 操作符的左右操作数必须有继承或实现关系
        if (o instanceof Equals){
            Equals e = (Equals) o;

            /**
             * 这不是Object的方法，但是用于判断两个对象是否相同
             * 更准确的讲，用于判断两个引用，是否指向了同一个对象
             */
            return this.hp == e.hp;
        }
        return false;
    }

    public static void main(String[] args) {
        Equals e = new Equals();
        Equals e1 = new Equals();
        Equals e2 = new Equals();
        e.hp = 300;
        e1.hp = 400;
        e2.hp = 300;
        System.out.println(e.equals(e1));
        System.out.println(e.equals(e2));

    }
}
