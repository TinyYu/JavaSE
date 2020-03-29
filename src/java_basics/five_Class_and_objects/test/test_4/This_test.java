package java_basics.five_Class_and_objects.test.test_4;

/**
 * 设计一个构造方法,但是参数名称不太一样，分别是
 * String name
 * float hp
 * float armor
 * int moveSpeed
 *
 * 不仅如此，在这个构造方法中，调用这个构造方法
 * public Hero(String name,float hp)
 */
public class This_test {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public This_test(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
    public This_test(String name,float hp,float armor,int moveSpeed){
        this(name,hp);
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }
}
