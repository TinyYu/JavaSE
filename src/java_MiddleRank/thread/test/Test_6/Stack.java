package java_MiddleRank.thread.test.Test_6;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Stack<T> {
    LinkedList<T> linkedList = new LinkedList<>();
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    public void push(T t){
        try {
            lock.lock();
            while (linkedList.size() >= 200){
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            linkedList.addLast(t);
            System.out.println("弹入:" + t + " 个数:" + linkedList.size());
            condition.signal();
        } finally {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.unlock();
        }
    }

    public T pull(){
        T t = null;
        try {
            lock.lock();
            while (linkedList.isEmpty()){
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            t = linkedList.removeLast();
            System.out.println("弹出:" + t + " 个数:" + linkedList.size());
            condition.signal();
        } finally {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.unlock();
        }
        return t;
    }
}
