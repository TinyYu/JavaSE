package java_Senior.reflection.reflection_1;

/**
 * 获取类对象的时候，会导致类属性被初始化
 **/
public class TestReflection_2 {
    public static void main(String[] args) {
        String className = "java_Senior.reflection.reflection_1.Hero";
        try {
            Class pClass = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
} 
