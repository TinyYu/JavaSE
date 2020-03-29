package java_MiddleRank.list.linkedlist;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列
 **/
public class TestLinked2 {
    public static void main(String[] args) {
        Queue<Hero> queue = new LinkedList<>();

        //在队列最后面添加
        queue.offer(new Hero("hero1",1));
        queue.offer(new Hero("hero2",2));
        queue.offer(new Hero("hero3",3));
        queue.offer(new Hero("hero4",4));
        System.out.println(queue);

        //取出第一个Hero，FIFO先进先出
        Hero h = queue.poll();
        System.out.println(queue);

        //查看第一个元素
        System.out.println(queue.peek());
        System.out.println(queue);
    }
} 
