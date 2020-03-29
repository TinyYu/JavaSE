package java_basics.five_Class_and_objects.constructor;

/**
 * 隐士构造方法
 */
public class Constructor_2 {
    String name;
    //这个无参的构造方法，如果不写，
    //就会默认提供一个无参的构造方法
    //  public Hero(){
    //      System.out.println("调用Hero的构造方法");
    //  }
    public static void main(String[] args) {
        Constructor_2 c = new Constructor_2();
    }
}
