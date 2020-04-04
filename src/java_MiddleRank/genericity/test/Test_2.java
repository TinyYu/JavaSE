package java_MiddleRank.genericity.test;


import java.util.ArrayList;
import java.util.List;

/**
 * 支持泛型的二叉树
 */

public class Test_2<T extends Comparable<T>> {//指定类需要实现Comparable接口
    //左子节点
    private Test_2<T> leftNode;
    //右子节点
    private Test_2<T> rightNode;

    //值
    private T value;

    //插入数据
    public void add(T t){
        if (value == null){
            value = t;
        } else {
            if (t.compareTo(value) < 0){
                if (leftNode == null) {
                    leftNode = new Test_2<>();
                }
                leftNode.add(t);
            } else {
                if (rightNode == null){
                    rightNode = new Test_2<>();
                }
                rightNode.add(t);
            }

        }
    }

    //遍历
    public List<T> values(){
        List<T> list = new ArrayList<>();

        //左节点
        if (leftNode != null){
            list.addAll(leftNode.values());
        }

        //当前节点
        list.add(value);

        //右节点
        if (rightNode != null){
            list.addAll(rightNode.values());
        }

        return list;
    }
}
