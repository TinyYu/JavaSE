package java_basics.six_interface_and_inheritance.class_type_conversion;

/**
 * 接口转换成实现类(向下转型)
 */
public class Test_5 {
    public static void main(String[] args) {
        ADHero ad = new ADHero();
        AD ad1 = null;
        ad = (ADHero) ad1;
    }
}
