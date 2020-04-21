package java_Senior.reflection.reflection_1;

import java_MiddleRank.thread.thread_1.Hero;

/**
 * 获取类对象
 *
 * 类对象，就是用于描述这种类，都有什么属性，什么方法的
 * 获取类对象有3种方式
 *  1. Class.forName
 *  2. Hero.class
 *  3. new Hero().getClass()
 **/
public class TestReflection_1 {
    public static void main(String[] args) {
        String className = "java_MiddleRank.thread.thread_1.Hero";
        try {
            Class pClass1 = Class.forName(className);
            Class pClass2 = Hero.class;
            Class pClass3 = new Hero().getClass();
            System.out.println(pClass1 + " " + pClass2 + " " + pClass3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
} 
