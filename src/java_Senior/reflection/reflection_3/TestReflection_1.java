package java_Senior.reflection.reflection_3;

import java.lang.reflect.Field;

/**
 * 访问属性
 *
 * 通过反射修改属性值
 * getField和getDeclaredField的区别
 *    这两个方法都是用于获取字段
 *          1.getField 只能获取public的，包括从父类继承来的字段。
 *          2.getDeclaredField 可以获取本类所有的字段，包括private的，但是不能获取继承来的字段。 (注： 这里只能获取到private的字段，但并不能访问该private字段的值,除非加上setAccessible(true))
 **/
public class TestReflection_1 {
    public static void main(String[] args) {
        Hero hero = new Hero();

        //传统方式修改属性
        hero.setName("hero");
        System.out.println(hero.getName());

        //通过反射修改属性值
        try {
            Field f1 = hero.getClass().getDeclaredField("name");
            //private修饰时需要f1.setAccessible(true)，public不需要
            f1.setAccessible(true);
            f1.set(hero,"teemo");
            System.out.println(hero.getName());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
} 
