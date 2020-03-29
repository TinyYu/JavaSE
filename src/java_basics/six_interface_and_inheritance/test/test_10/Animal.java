package java_basics.six_interface_and_inheritance.test.test_10;

public abstract class Animal {
    protected int legs;//腿数目

    //初始化腿数目
    protected Animal(int legs){
        this.legs = legs;
    }


    public void walk() {
        System.out.printf("使用%d条腿行动",this.legs);
    }

    public abstract void eat();
}
