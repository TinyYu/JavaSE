package java_basics.six_interface_and_inheritance.test.test_10;

/**
 * 蜘蛛
 */
public class Spider extends Animal{

    public Spider(int legs) {
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("吃昆虫");
    }
}
