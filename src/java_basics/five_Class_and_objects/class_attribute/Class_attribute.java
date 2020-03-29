package java_basics.five_Class_and_objects.class_attribute;

/**
 * 类属性
 */
public class Class_attribute {
    public String name;//实例属性，对象属性，非静态属性
    static String copyright;//类属性，静态属性

    public static void main(String[] args) {
        Class_attribute c = new Class_attribute();
        c.name = "提莫";
        Class_attribute.copyright = "Riot Games公司";
        System.out.println(c.name);
        System.out.println(copyright);

        Class_attribute c1 = new Class_attribute();
        c.name = "盖伦";
        System.out.println(c1.name);
        System.out.println(copyright);

        Class_attribute.copyright = "Blizzard Entertainment Enterprise";
        System.out.println(Class_attribute.copyright);
    }
}
