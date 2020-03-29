package java_basics.six_interface_and_inheritance.rewrite;

/**
 * 继承Item,同时提供effect方法
 */
public class LifePotion extends Item{
    public void effect(){
        System.out.println("血瓶使用后，可以回血");
    }
}
