package java_Senior.annotation.annotation_3;

import java.lang.annotation.*;

/**
 * @Repeatable 运用
 **/
public class TestAnnotation_2 {
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface FileTypes{
        FileType[] value();
    }

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(TestAnnotation_2.FileTypes.class)
    public @interface FileType{
        String value();
    };

    @FileType( ".java" )
    @FileType( ".html" )
    @FileType( ".css" )
    @FileType( ".js" )

    public void work(){
        try {
            FileType[] fileTypes = this.getClass().getMethod("work").getAnnotationsByType(FileType.class);
            System.out.println("将如下后缀名的文件中查找文件内容");
            for (FileType fileType : fileTypes){
                System.out.println(fileType.value());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TestAnnotation_2().work();
    }
} 
