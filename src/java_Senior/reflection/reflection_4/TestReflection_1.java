package java_Senior.reflection.reflection_4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 调用方法
 **/
public class TestReflection_1 {
    public static void main(String[] args) {
        Hero hero = new Hero();

        try {
            //获取方法名是setName，参数类型是String的方法
            Method m = hero.getClass().getMethod("setName",String.class);
            //对hero对象，调用这个方法
            m.invoke(hero,"hero");
            System.out.println(hero.getName());
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
