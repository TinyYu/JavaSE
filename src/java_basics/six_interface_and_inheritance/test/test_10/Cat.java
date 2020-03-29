package java_basics.six_interface_and_inheritance.test.test_10;

public class Cat extends Animal implements Pet{
    String name;

    public Cat(String name){
        //调用超类构造器指定猫都是4条腿
        //在初始化当前对象时，要先保证父类对象先初始化
        super(4);//顺序不可乱
        this.name = name;
    }

    public Cat(){
        //该构造器调用前一个构造器（用this关键字）并传递一个空字符串作为参数
        this("");
    }

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("玩");
    }
}
