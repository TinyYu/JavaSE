package java_Senior.annotation.annotation_2;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.METHOD;

/**
 * 自定义注解@JDBCConfig
 **/

//表示这个注解可以用用在类/接口上，还可以用在方法上
@Target({METHOD, TYPE})

//这是一个运行时注解，即运行起来之后，才获取注解中的相关信息
@Retention(RetentionPolicy.RUNTIME)

//可以被子类继承
@Inherited

//当执行javadoc的时候，本注解会生成相关文档
@Documented
public @interface TestAnnotation_2 {
    String ip();
    int port() default 3306;
    String database();
    String encoding();
    String loginName();
    String password();
} 
