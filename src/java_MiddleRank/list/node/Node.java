package java_MiddleRank.list.node;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树
 **/
public class Node {
    //左子节点
    private Node leftNode;
    //右子节点
    private Node rightNode;

    //值
    private Object value;

    //插入数据
    public void add(Object v){

        if (value == null) {//如果当前节点没有值
            value = v;
        } else {//如果有值进行判断
            if ((Integer)value < (Integer) v){
                if (null == rightNode){
                    rightNode = new Node();
                }
                rightNode.add(v);
            } else {
                if (null == leftNode){
                    leftNode = new Node();
                }
                leftNode.add(v);
            }
        }
    }

    //遍历二叉树
    public List<Object> values(){
        List<Object> list = new ArrayList<>();

        //左节点
        if (null != leftNode){
            list.addAll(leftNode.values());
        }

        //当前节点(中节点)
        list.add(value);

        //右节点
        if (null != rightNode){
            list.addAll(rightNode.values());
        }
        return list;
    }

    public static void main(String[] args) {
        int randoms[] = {78,89,767,23,64,2};
        Node n = new Node();
        for (int number : randoms){
            n.add(number);
        }

        List<Object> list = n.values();
        for (Object l : list){
            System.out.println(l);
        }
    }
} 
