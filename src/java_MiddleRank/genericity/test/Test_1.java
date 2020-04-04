package java_MiddleRank.genericity.test;

import java.util.ArrayList;

/**
 * 设计一个集合，这个集合里即可以放整数，也可以放浮点数，但是不能放字符串
 */
public class Test_1 {
    public static void main(String[] args) {
        ArrayList<Number> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1.1f);
//        arrayList.add("adasd");
    }
}
