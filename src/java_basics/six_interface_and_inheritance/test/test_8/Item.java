package java_basics.six_interface_and_inheritance.test.test_8;


public abstract class Item {
    public abstract boolean disposable();

    public static void main(String[] args) {
        Item i = new Item() {
            @Override
            public boolean disposable() {
                return false;
            }
        };
        i.disposable();
    }
} 
