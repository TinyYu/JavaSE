package java_basics.five_Class_and_objects.transfer_parameters;

/**
 * 基本类型传参
 */
public class Base_type {
    String name;
    int hp;

    //回血
    public void huixue(int xp){
        hp = hp + xp;
        //回血结束，血瓶为0
        xp = 0;
    }

    public Base_type(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public static void main(String[] args) {
        Base_type b = new Base_type("提莫",123);

        //血瓶回血值100
        int xueping = 100;
        b.huixue(xueping);
        System.out.println(b.hp);
    }
}
/**
 * 如果一个变量是基本类型
 * 比如 int hp = 50;
 * 我们就直接管hp叫变量
 * =表示赋值的意思。
 * 如果一个变量是类类型
 * 比如 Hero h = new Hero();
 * 我们就管h叫做引用。
 * =不再是赋值的意思
 * =表示指向的意思
 * 比如 Hero h = new Hero();
 * 这句话的意思是
 * 引用h，指向一个Hero对象
 */
