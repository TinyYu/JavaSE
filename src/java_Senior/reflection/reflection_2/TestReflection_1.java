package java_Senior.reflection.reflection_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射机制创造一个对象
 **/
public class TestReflection_1 {
    public static void main(String[] args) {
        //传统new的方式
        Hero h1 = new Hero();

        //使用反射机制
        String className = "java_Senior.reflection.reflection_2.Hero";
        try {
            //类对象
            Class pClass = Class.forName(className);
            //构造器
            Constructor c = pClass.getConstructor();
            //通过构造器实例化
            Hero h2 = (Hero)c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
} 
