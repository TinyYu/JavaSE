package java_MiddleRank.list.test.test_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ly
 * @date: 2020/03/18
 **/
public class Node1 {
    //左节点
    private Node1 leftNode;
    //右节点
    private Node1 rightNode;
    //值
    private Object value;

    //插入数据
    public void add(Object v){
        if (value == null){
            value = v;
        } else {
            if ((Integer)value >= (Integer) v){
                if (leftNode == null) {
                    leftNode = new Node1();
                }
                leftNode.add(v);
            } else {
                if (rightNode == null) {
                    rightNode = new Node1();
                }
                rightNode.add(v);
            }
        }
    }

    //遍历
    public List<Object> values(){
        List<Object> list = new ArrayList<>();
        //左
        if (leftNode != null){
            list.addAll(leftNode.values());
        }
        //当前值
        list.add(value);
        //右
        if (rightNode != null){
            list.addAll(rightNode.values());
        }
        return list;
    }

    public static void main(String[] args) {
        //二叉树
        Node1 n = new Node1();
        long srctime = System.currentTimeMillis();
        for (int i = 0;i < 40000;i++){
            n.add((int)(Math.random() * 40000));
        }
        long desctime = System.currentTimeMillis();
        System.out.println("二叉树时间:" + (desctime - srctime));

        //冒泡
        int[] v = new int[40000];
        srctime = System.currentTimeMillis();
        for (int i = 0; i < 40000;i++){
            v[i] = (int)(Math.random() * 40000);
        }
        for (int i = 0;i < v.length;i++){
            for (int j = 0;j < v.length - i - 1;j++){
                if (v[i] > v[i + 1]){
                    int time = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = time;
                }
            }
        }
        desctime = System.currentTimeMillis();
        System.out.println("冒泡时间:" + (desctime - srctime));

        //选择
        int[] v2 = new int[40000];
        srctime = System.currentTimeMillis();
        for (int i = 0; i < 40000;i++){
            v2[i] = (int)(Math.random() * 40000);
        }
        for (int i = 0;i < v2.length - 1;i++){
            for (int j = i + 1;j < v2.length;j++){
                if (v2[i] > v2[i + 1]){
                    int time = v[i];
                    v2[i] = v2[i + 1];
                    v2[i + 1] = time;
                }
            }
        }
        desctime = System.currentTimeMillis();
        System.out.println("选择时间:" + (desctime - srctime));
    }
} 
