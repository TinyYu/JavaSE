package java_basics.five_Class_and_objects.test.test_5;

/**
 * 在方法中，使参数引用指向一个新的对象
 *
 * 外面的引用是指向原来的对象？还是新的对象？
 * 原来对象
 * 关键在于，有没有创建一个新的对象。在调用复活函数之后，
 * 输出的血量仍然是老对象的值。但是在复活函数中创建了一个新对象，和老对象没关系。
 */
public class Hero {
    String name;
    float hp;

    public Hero() {
    }

    public Hero(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    //复活
    public void revive(Hero h){
        h = new Hero("提莫",384);
    }

    public static void main(String[] args) {
        Hero h = new Hero("提莫",384);
        h.hp = h.hp - 400;
        h.revive(h);
        System.out.println(h.hp);
    }
}
