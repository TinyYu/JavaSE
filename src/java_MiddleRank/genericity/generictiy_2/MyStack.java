package java_MiddleRank.genericity.generictiy_2;

import java.util.LinkedList;

/**
 * 支持泛型的栈
 */
public class MyStack<T> {
    LinkedList<T> linkedList = new LinkedList<>();

    public void push(T t){
        linkedList.addLast(t);
    }

    public T pull(){
        return linkedList.removeLast();
    }

    public T peek(){
        return linkedList.getLast();
    }

    public static void main(String[] args) {
        //使用泛型<Hero>表示只能存放Hero和其子类
        MyStack<Hero> myStack = new MyStack<>();
        myStack.push(new Hero("1"));

        //使用泛型<Item>表示只能存放Item和其子类
        MyStack<Item> myStack1 = new MyStack<>();
        myStack1.push(new Item("1"));
    }
}
