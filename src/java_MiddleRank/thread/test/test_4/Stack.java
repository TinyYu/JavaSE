package java_MiddleRank.thread.test.test_4;


import java.util.LinkedList;

public class Stack {
    LinkedList<Character> linkedList = new LinkedList<>();

    public synchronized void push(char c){
        while (linkedList.size() >= 200){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        linkedList.offer(c);
        System.out.println("压入:" + c + " 压入个数:"+ linkedList.size());
        this.notify();
    }

    public synchronized char pull(){
        while (linkedList.size() == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        char c = linkedList.get(linkedList.size() - 1);
        linkedList.remove(linkedList.size() - 1);
        this.notify();
        return c;
    }
}
