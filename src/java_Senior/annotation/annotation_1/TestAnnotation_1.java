package java_Senior.annotation.annotation_1;

/**
 * 基本内置注解
 **/
public class TestAnnotation_1 {
    /**
     * @Override 方法重写
     * 如果父类没有该方法，添加@Override注解会失败
     */
    @Override
    public String toString(){
        return "Override 方法重写";
    }

    /**
     * @Deprecated 方法已过期
     * 调用该方法，会有提示
     */
    @Deprecated
    public void hackMap(){}

    /**
     * @SuppressWarnings 忽略告警信息
     * 有常见的值，分别对应如下意思
     *  1.deprecation：使用了不赞成使用的类或方法时的警告(使用@Deprecated使得编译器产生的警告)；
     *  2.unchecked：执行了未检查的转换时的警告，例如当使用集合时没有用泛型 (Generics) 来指定集合保存的类型; 关闭编译器警告
     *  3.fallthrough：当 Switch 程序块直接通往下一种情况而没有 Break 时的警告;
     *  4.path：在类路径、源文件路径等中有不存在的路径时的警告;
     *  5.serial：当在可序列化的类上缺少 serialVersionUID 定义时的警告;
     *  6.finally：任何 finally 子句不能正常完成时的警告;
     *  7.rawtypes 泛型类型未指明
     *  8.unused 引用定义了，但是没有被使用
     *  9.all：关于以上所有情况的警告。
     */

    public static void main(String[] args) {
        new TestAnnotation_1().hackMap();
    }


}
