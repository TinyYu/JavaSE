package java_basics.six_interface_and_inheritance.test.test_5;

public class ADHero extends Hero {
    //首先 如果子类不写构造方法，
    // 会执行默认的无参构造，无参构造会执行父类的无参构造，
    // 但父类的无参构造 没有。所以会报错
    public ADHero(String name){
        super(name);
    }
    //子类默认最先调用父类的无参数构造方法。
    // 如果没有无参数构造方法，只有有参数的 。
    // 通过加入super调用父类有参的。
    public static void main(String[] args) {

    }
}
