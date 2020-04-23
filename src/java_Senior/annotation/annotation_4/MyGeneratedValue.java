package java_Senior.annotation.annotation_4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * MyGeneratedValue 对应 javax.persistence.GeneratedValue
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyGeneratedValue {
    String strategy();
}
