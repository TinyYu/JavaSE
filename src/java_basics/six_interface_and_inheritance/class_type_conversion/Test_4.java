package java_basics.six_interface_and_inheritance.class_type_conversion;

/**
 * 实现类转换成接口(向上转型
 */
public class Test_4 {
    public static void main(String[] args) {
        //引用ad指向的对象是ADHero类型，这个类型实现了AD接口
        ADHero ad = new ADHero();

        //把一个ADHero类型转换为AD接口
        //从语义上来讲，把一个ADHero当做AD来使用，
        // 而AD接口只有一个attae方法，
        // 这就意味着转换后就有可能要调用attae方法，
        // 而ADHero一定是有attae方法的，所以转换是能成功的。
        AD ad1 = ad;
    }
}
