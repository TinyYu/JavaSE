package java_Senior.reflection.reflection_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 使用反射
 * 首先准备一个配置文件spring.txt, 放在src目录下。里面存放的是类的名称，和要调用的方法名。
 * 当需要从调用第一个业务方法，切换到调用第二个业务方法的时候，不需要修改一行代码，也不需要重新编译，只需要修改配置文件spring.txt，再运行即可。
 */
public class TestReflection_2 {
    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //从spring.txt中获取类名称和方法名称
        File springConfigFile = new File("F:\\java\\JavaSE\\src\\java_Senior\\reflection\\reflection_5\\spring.txt");
        Properties springConfig = new Properties();
        springConfig.load(new FileInputStream(springConfigFile));
        String className = (String) springConfig.get("class");
        String methodName = (String) springConfig.get("method");

        //根据类名称获取类对象
        Class clazz = Class.forName(className);
        //根据方法名称，获取对象方法
        Method m = clazz.getMethod(methodName);
        //获取构造器
        Constructor c = clazz.getConstructor();
        //根据构造器实例化对象
        Object service = c.newInstance();
        //调用对象的指定方法
        m.invoke(service);
    }
}
