package java_basics.six_interface_and_inheritance.test.test_6;


public class Item {
    String name;
    float price;

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void finalize(){
        System.out.println("这个对象正在被回收");
    }

    public boolean equals(Object o){
        if (o instanceof Item){
            Item i = (Item) o;
            return this.price == i.price;
        }
        return false;
    }

    public static void main(String[] args) {
        Item i = new Item();
        System.out.println(i.toString());
        i.price = 100;
        Item i1 = new Item();
        i1.price = 100;
        System.out.println(i1.equals(i));

        Item i3;
        for (int z = 0;z < 1000000;z++){
            i3 = new Item();
        }
    }
}
