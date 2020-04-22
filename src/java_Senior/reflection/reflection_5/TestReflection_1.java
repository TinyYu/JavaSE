package java_Senior.reflection.reflection_5;

/**
 * 不使用反射
 **/
public class TestReflection_1 {
    public static void main(String[] args) {
        //当需要从第一个业务方法切换到第二个业务方法的时候，使用非反射方式，必须修改代码，并且重新编译运行，才可以达到效果
        new Service1().doService1();
        //new Service2().doService2();
    }
} 
