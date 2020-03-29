package java_basics.six_interface_and_inheritance.test.test_1;

/**
 * 辅助
 */
public class SupportHero extends Hero implements Healer{
    @Override
    public void heal() {
        System.out.println("进行治疗");
    }
}
