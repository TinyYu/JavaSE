package java_MiddleRank.list.linkedlist;



import java.util.LinkedList;

/**
 * 双向链表
 */
public class TestLinked {
    public static void main(String[] args) {
        //LinkedList是一个双向链表结构的list
        LinkedList<Hero> linkedList = new LinkedList<>();

        //在最后插入hero
        linkedList.addLast(new Hero("hero1",1));
        linkedList.addLast(new Hero("hero2",2));
        linkedList.addLast(new Hero("hero3",3));
        System.out.println(linkedList);

        //在最前面插入hero
        linkedList.addFirst(new Hero("hero0",0));
        System.out.println(linkedList);

        //查看第一位hero
        System.out.println(linkedList.getFirst());
        //查看最后一位hero
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);

        //取出最前面的hero
        System.out.println(linkedList.removeFirst());
        //取出最后面的hero
        System.out.println(linkedList.removeLast());
        //取出会导致英雄被删除
        System.out.println(linkedList);
    }
} 
