package java_basics.five_Class_and_objects.this_test;

/**
 * this代表当前对象
 */
public class This_1 {
    String name;
    float hp;

    //打印内存中的虚拟地址
    public void showAddressInMenmiry(){
        System.out.println("打印this的虚拟内存：" + this);
    }

    public static void main(String[] args) {
        This_1 t = new This_1();
        t.name = " 盖伦";
        //直接打印对象，会显示该对象在内存中的虚拟地址
        //格式：Hero@c17164 c17164即虚拟地址，每次执行，得到的地址不一定一样
        System.out.println("打印对象的虚拟地址:" + t);
        //调用showAddressInMemory，打印该对象的this，显示相同的虚拟地址
        t.showAddressInMenmiry();

        This_1 t1 = new This_1();
        t1.name = "提莫";
        System.out.println("打印对象的虚拟地址:" + t1);
        //调用showAddressInMemory，打印该对象的this，显示相同的虚拟地址
        t1.showAddressInMenmiry();
    }
}
