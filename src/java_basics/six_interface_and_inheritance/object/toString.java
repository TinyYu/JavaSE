package java_basics.six_interface_and_inheritance.object;

/**
 * toString()的意思是返回当前对象的字符串表达
 */
public class toString {
    String name;

    @Override
    public String toString() {
        return "toString{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        toString t = new toString();
        System.out.println(t.toString());
    }
}
