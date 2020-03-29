package java_basics.five_Class_and_objects.constructor;

/**
 * 构造方法的重载
 */
public class Constructor_4 {
    String name;
    int hp;

    //带一个参数的构造方法
    public Constructor_4(String heroname){
        name = heroname;
    }
    //带两个参数的构造方法
    public Constructor_4(String heroname,int herohp){
        name = heroname;
        hp = herohp;
    }

    public static void main(String[] args) {
        Constructor_4 c =  new Constructor_4("盖伦");
        Constructor_4 c2 = new Constructor_4("提莫",123);
    }

}
