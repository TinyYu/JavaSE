package java_MiddleRank.list.test.test_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ly
 * @date: 2020/03/18
 **/
public class Node {
    //左节点
    private Node leftNode;
    //右节点
    private Node rightNode;
    //值
    private Hero value;

    //插入数据
    public void add(Hero o){
        if (null == value){//当前节点没有值
            value = o;
        } else {
            if (value.getHp() >= o.getHp()){
                if (leftNode == null){
                   leftNode = new Node();
                }
                leftNode.add(o);
            } else {
                if (rightNode == null){
                    rightNode = new Node();
                }
                rightNode.add(o);
            }
        }
    }

    //遍历
    public List<Object> values(){
        List<Object> list = new ArrayList<>();

        //左节点
        if (leftNode != null){
            list.addAll(leftNode.values());
        }
        //当前节点(中)
        list.add(value);
        //右节点
        if (rightNode != null){
            list.addAll(rightNode.values());
        }
        return list;
    }

    public static void main(String[] args) {
        Node n = new Node();
        for (int i = 0;i < 10;i++){
            n.add(new Hero("hero " + i,(float)(Math.random() * 100)));
        }

        List<Object> list = n.values();
        for (Object l : list){
            System.out.println(l);
        }
    }
} 
