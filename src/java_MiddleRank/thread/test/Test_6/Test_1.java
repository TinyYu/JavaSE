package java_MiddleRank.thread.test.Test_6;

import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test_1 {
    LinkedList<String> linkedList = new LinkedList();
    Lock lock = new ReentrantLock();

    //添加元素到最后一位
    public void push(String string){
        try {
            lock.lock();
            linkedList.addLast(string);
        } finally {
            lock.unlock();
        }
    }

    //取出最后一个元素
    public String pull(){
        try{
            lock.lock();
            return linkedList.removeLast();
        } finally {
            lock.unlock();
        }
    }

    //查看最后一个元素
    public String peek(){
        try{
            lock.lock();
            return linkedList.peekLast();
        } finally {
            lock.unlock();
        }
    }
}
