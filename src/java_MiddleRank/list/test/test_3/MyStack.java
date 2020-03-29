package java_MiddleRank.list.test.test_3;

import java.util.LinkedList;

/**
 * @author: ly
 * @date: 2020/03/18
 **/
public class MyStack implements Stack {
    private LinkedList<Object> linkedList =  new LinkedList<>();
    @Override
    public void push(Object o) {
        linkedList.addFirst(o);
    }

    @Override
    public Object pull() {
        return linkedList.removeLast();
    }

    @Override
    public Object peek() {
        return linkedList.getLast();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "linkedList=" + linkedList +
                '}';
    }
}
