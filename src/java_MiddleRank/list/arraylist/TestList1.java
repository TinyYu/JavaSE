package java_MiddleRank.list.arraylist;

import java.util.ArrayList;

/**
 * @author: ly
 * @date: 2020/03/17
 **/
public class TestList1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        //添加
        arrayList.add(new Hero("1",1));
        //指定位置添加
        arrayList.add(1,new Hero("2",2));

        //判断是否存在
        Hero h = new Hero("2",2);
        arrayList.add(h);
        //判断是否是同一个对象，而不是name是否相同
        arrayList.contains(h);

        //获取指定位置的对象
        arrayList.get(1);
        //超出范围，会报错
        arrayList.get(10);

        //获取对象所在的位置
        //判断标准是对象是否相同，而非对象的name值是否相等
        arrayList.indexOf(h);

        //删除
        //根据下标删除
        arrayList.remove(0);
        //根据对象删除
        arrayList.remove(h);

        //替换指定位置的元素
        arrayList.set(1,new Hero("3",3));

        //获取大小
        arrayList.size();

        //转换为数组
        arrayList.toArray();

        //添加一个集合
        ArrayList list = new ArrayList();
        arrayList.addAll(list);

        //清空
        arrayList.clear();
    }
} 
