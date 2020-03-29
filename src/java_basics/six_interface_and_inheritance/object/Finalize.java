package java_basics.six_interface_and_inheritance.object;

/**
 * 当一个对象没有任何引用指向的时候，它就满足垃圾回收的条件
 * 当它被垃圾回收的时候，它的finalize() 方法就会被调用。
 * finalize() 不是开发人员主动调用的方法，而是由虚拟机JVM调用的。
 */
public class Finalize {
    String name;

    public void finalize(){
        System.out.println("这个英雄正在被回收");
    }

    public static void main(String[] args) {
        //只有一个引用
        Finalize f;
        for (int i = 0;i < 10000000;i++){
            /**
             * 不断生成新的对象
             * 每创建一个对象，前一个对象就没有引用指向
             * 没有引用指向的对象九满足垃圾回收的条件
             * 当垃圾堆积比较多的时候，就会触发垃圾回收机制
             * 一旦对象被回收，他的finalize()方法就会被调用
             */
            f = new Finalize();
        }
    }
}
