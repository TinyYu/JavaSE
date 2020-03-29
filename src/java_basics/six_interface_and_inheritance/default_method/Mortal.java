package java_basics.six_interface_and_inheritance.default_method;

/**
 * 默认方法
 */
public interface Mortal {
    public void die();

    //Mortal 这个接口，增加了一个默认方法 revive，这个方法有实现体，并且被声明为了default
    default public void revive(){
        System.out.println("复活");
    }
} 
