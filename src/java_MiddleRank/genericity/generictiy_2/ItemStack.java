package java_MiddleRank.genericity.generictiy_2;


import java.util.LinkedList;

/**
 * 存放Item的栈
 */
public class ItemStack {
    LinkedList<Item> items = new LinkedList<>();

    public void push(Item item){
        items.addLast(item);
    }

    public Item pull(){
        return items.removeLast();
    }

    public static void main(String[] args) {
        ItemStack itemStack = new ItemStack();
        for (int i = 0;i < 5;i++){
            Item item = new Item("item name" + i);
            System.out.println("压入:" + item);
            itemStack.push(item);
        }

        for (int i = 0;i < 5;i++){
            Item item = itemStack.pull();
            System.out.println("弹出:" + item);
        }
    }
}
