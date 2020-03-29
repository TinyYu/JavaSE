package java_basics.five_Class_and_objects.transfer_parameters;

/**
 * 类类型传参
 */
public class Class_type {
    String name;
    float hp;

    public Class_type(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    //攻击一个英雄，并让他掉damage点血
    public void attack(Class_type class_type,int damage){
        class_type.hp = class_type.hp - damage;
    }

    public static void main(String[] args) {
        Class_type c = new Class_type("提莫",123);
        Class_type c1 = new Class_type("盖伦",234);
        c1.attack(c,100);
        System.out.println(c.hp);
    }
}
