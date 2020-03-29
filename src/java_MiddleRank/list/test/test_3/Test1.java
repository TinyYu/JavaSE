package java_MiddleRank.list.test.test_3;


/**
 * @author: ly
 * @date: 2020/03/18
 **/
public class Test1 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(new Hero("hero1",1));
        myStack.push(new Hero("hero2",2));
        myStack.push(new Hero("hero3",3));
        System.out.println(myStack);
        System.out.println(myStack.pull());
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack);
    }
} 
