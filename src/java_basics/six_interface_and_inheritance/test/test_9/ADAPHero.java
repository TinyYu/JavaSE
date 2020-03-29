package java_basics.six_interface_and_inheritance.test.test_9;

/**
 * @author: ly
 * @date: 2020/03/09
 **/
public class ADAPHero implements AD,AP {

    @Override
    public void attack() {
        System.out.println("重写的attack");
    }
}
